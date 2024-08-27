package com.mhcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        System.out.println(
                "\n" +
                "            _                                _             _             _     _ \n" +
                "           | |                              (_)           | |           | |   | |\n" +
                "  _ __ ___ | |__   ___ ___   _ __ ___   __ _ _ _ __    ___| |_ __ _ _ __| |_  | |\n" +
                " | '_ ` _ \\| '_ \\ / __/ __| | '_ ` _ \\ / _` | | '_ \\  / __| __/ _` | '__| __| | |\n" +
                " | | | | | | | | | (_| (__  | | | | | | (_| | | | | | \\__ \\ || (_| | |  | |_  |_|\n" +
                " |_| |_| |_|_| |_|\\___\\___| |_| |_| |_|\\__,_|_|_| |_| |___/\\__\\__,_|_|   \\__| (_)\n" +
                "                                                                                 \n" +
                "                                                                                 \n");
    }
}