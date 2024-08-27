package com.mhcc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class TaskApplication {

    private static final Logger LOG =  LoggerFactory.getLogger(TaskApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TaskApplication.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            LOG.info("Spring Boot 使用profile为: application-" + profile + ".yml");
        }
    }
}