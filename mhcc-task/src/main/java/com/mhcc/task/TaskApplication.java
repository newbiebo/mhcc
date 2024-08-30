package com.mhcc.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {

    private static final Logger LOG =  LoggerFactory.getLogger(TaskApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        System.out.println(
                "\n" +
                "            _                _            _          _             _     _ \n" +
                "           | |              | |          | |        | |           | |   | |\n" +
                "  _ __ ___ | |__   ___ ___  | |_ __ _ ___| | __  ___| |_ __ _ _ __| |_  | |\n" +
                " | '_ ` _ \\| '_ \\ / __/ __| | __/ _` / __| |/ / / __| __/ _` | '__| __| | |\n" +
                " | | | | | | | | | (_| (__  | || (_| \\__ \\   <  \\__ \\ || (_| | |  | |_  |_|\n" +
                " |_| |_| |_|_| |_|\\___\\___|  \\__\\__,_|___/_|\\_\\ |___/\\__\\__,_|_|   \\__| (_)\n" +
                "                                                                           \n" +
                "                                                                           \n");
    }
}