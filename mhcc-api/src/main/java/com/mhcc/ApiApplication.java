package com.mhcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        System.out.println(
                "\n" +
                "            _                            _       _             _     _ \n" +
                "           | |                          (_)     | |           | |   | |\n" +
                "  _ __ ___ | |__   ___ ___    __ _ _ __  _   ___| |_ __ _ _ __| |_  | |\n" +
                " | '_ ` _ \\| '_ \\ / __/ __|  / _` | '_ \\| | / __| __/ _` | '__| __| | |\n" +
                " | | | | | | | | | (_| (__  | (_| | |_) | | \\__ \\ || (_| | |  | |_  |_|\n" +
                " |_| |_| |_|_| |_|\\___\\___|  \\__,_| .__/|_| |___/\\__\\__,_|_|   \\__| (_)\n" +
                "                                  | |                                  \n" +
                "                                  |_|                                  \n");
    }
}