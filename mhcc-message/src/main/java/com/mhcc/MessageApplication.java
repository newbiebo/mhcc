package com.mhcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class, args);
        System.out.println(
                "\n" +
                "            _                                                               _             _     _ \n" +
                "           | |                                                             | |           | |   | |\n" +
                "  _ __ ___ | |__   ___ ___   _ __ ___   ___  ___ ___  __ _  __ _  ___   ___| |_ __ _ _ __| |_  | |\n" +
                " | '_ ` _ \\| '_ \\ / __/ __| | '_ ` _ \\ / _ \\/ __/ __|/ _` |/ _` |/ _ \\ / __| __/ _` | '__| __| | |\n" +
                " | | | | | | | | | (_| (__  | | | | | |  __/\\__ \\__ \\ (_| | (_| |  __/ \\__ \\ || (_| | |  | |_  |_|\n" +
                " |_| |_| |_|_| |_|\\___\\___| |_| |_| |_|\\___||___/___/\\__,_|\\__, |\\___| |___/\\__\\__,_|_|   \\__| (_)\n" +
                "                                                            __/ |                                 \n" +
                "                                                           |___/                                  \n");
    }
}