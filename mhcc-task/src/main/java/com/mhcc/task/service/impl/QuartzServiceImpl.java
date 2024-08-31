package com.mhcc.task.service.impl;

import com.mhcc.task.service.QuartzService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 定时任务管理
 */
@Service
public class QuartzServiceImpl implements QuartzService {

    private static final Logger LOG =  LoggerFactory.getLogger(QuartzServiceImpl.class);

    @Resource
    private Scheduler scheduler;

    @Override
    public void startJob(String jobName, String jobGroup, String cron, String className){
        Class<Job> jobClass = null;
        try {
            jobClass = (Class<Job>) Class.forName(className);
            // Get the task execution class
        } catch (ClassNotFoundException e) {
            LOG.error("Task class does not exist!");
        }
        // Create a job and specify the job name and grouping
        JobDetail jobDetail = JobBuilder.newJob(jobClass).withIdentity(jobName, jobGroup).build();
        // Create Expression Work Plan
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(cron);
        // Create cronTrigger
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobName, jobGroup)
                .withSchedule(cronScheduleBuilder).build();
        try {
            scheduler.scheduleJob(jobDetail, cronTrigger);
            scheduler.start();
        } catch (SchedulerException e) {
            throw new RuntimeException(e);
        }
        LOG.info("jobName: {}, scheduler start! ", jobName);
    }

    @Override
    public void modifyJob(String jobName, String jobGroup, String cron) throws Exception {
        TriggerKey triggerKey = new TriggerKey(jobName, jobGroup);
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        String oldCron = trigger.getCronExpression();
        if (!oldCron.equals(cron)) {
            CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobName, jobGroup)
                    .withSchedule(CronScheduleBuilder.cronSchedule(cron)).build();
            Date date = scheduler.rescheduleJob(triggerKey, cronTrigger);
            if (date == null) {
                throw new Exception("Error in modifying the execution time of a scheduled task!");
            }
        }
    }

    @Override
    public void pauseJob(String jobName, String jobGroup) throws Exception {
        JobKey jobKey = new JobKey(jobName, jobGroup);
        JobDetail jobDetail = scheduler.getJobDetail(jobKey);
        if (jobDetail == null) {
            return;
        }
        scheduler.pauseJob(jobKey);
    }

    @Override
    public void resumeJob(String jobName, String jobGroup) throws Exception {
        JobKey jobKey = new JobKey(jobName, jobGroup);
        JobDetail jobDetail = scheduler.getJobDetail(jobKey);
        if (jobDetail == null) {
            return;
        }
        scheduler.resumeJob(jobKey);
    }

    @Override
    public void deleteJob(String jobName, String jobGroup) throws Exception {
        JobKey jobKey = new JobKey(jobName, jobGroup);
        JobDetail jobDetail = scheduler.getJobDetail(jobKey);
        if (jobDetail == null) {
            return;
        }
        scheduler.deleteJob(jobKey);
    }
}
