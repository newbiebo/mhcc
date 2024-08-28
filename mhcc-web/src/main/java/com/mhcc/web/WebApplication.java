package com.mhcc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        System.out.println(
                "\n" +
                "            _                             _           _             _   _ \n" +
                "           | |                           | |         | |           | | | |\n" +
                "  _ __ ___ | |__   ___ ___  __      _____| |__    ___| |_ __ _ _ __| |_| |\n" +
                " | '_ ` _ \\| '_ \\ / __/ __| \\ \\ /\\ / / _ \\ '_ \\  / __| __/ _` | '__| __| |\n" +
                " | | | | | | | | | (_| (__   \\ V  V /  __/ |_) | \\__ \\ || (_| | |  | |_|_|\n" +
                " |_| |_| |_|_| |_|\\___\\___|   \\_/\\_/ \\___|_.__/  |___/\\__\\__,_|_|   \\__(_)\n" +
                "                                                                          \n" +
                "                                                                          \n");
    }
}