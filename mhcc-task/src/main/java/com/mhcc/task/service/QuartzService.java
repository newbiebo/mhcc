package com.mhcc.task.service;

/**
 * @author newbiebo
 */
public interface QuartzService {
    /**
     * 启动任务
     * @param jobName job名称 UUID
     * @param jobGroup job组
     * @param cron 表达式
     * @param className 执行任务的 className
     * @throws Exception
     */
    void startJob(String jobName, String jobGroup, String cron,String className);

    /**
     * 修改定时任务执行时间
     *
     * @param jobName
     * @param jobGroup
     * @param cron     新的时间
     * @throws Exception
     */
    void modifyJob(String jobName, String jobGroup, String cron) throws Exception;
    /**
     * 暂停某个定时任务（任务恢复后，暂停时间段内未执行的任务会继续执行，如暂停时间段内有2次，则会执行2次）
     *
     * @param jobName
     * @param jobGroup
     * @throws Exception
     */
    void pauseJob(String jobName, String jobGroup) throws Exception;
    /**
     * 恢复某个定时任务
     *
     * @param jobName
     * @param jobGroup
     * @throws Exception
     */
    void resumeJob(String jobName, String jobGroup) throws Exception;
    /**
     * 删除某个定时任务
     *
     * @param jobName
     * @param jobGroup
     * @throws Exception
     */
    void deleteJob(String jobName, String jobGroup) throws Exception;
}
