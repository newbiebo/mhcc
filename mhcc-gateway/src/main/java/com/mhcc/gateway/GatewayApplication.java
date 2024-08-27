package com.mhcc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class    GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        System.out.println(
                "\n" +
                "            _                            _                                 _             _     _ \n" +
                "           | |                          | |                               | |           | |   | |\n" +
                "  _ __ ___ | |__   ___ ___    __ _  __ _| |_ _____      ____ _ _   _   ___| |_ __ _ _ __| |_  | |\n" +
                " | '_ ` _ \\| '_ \\ / __/ __|  / _` |/ _` | __/ _ \\ \\ /\\ / / _` | | | | / __| __/ _` | '__| __| | |\n" +
                " | | | | | | | | | (_| (__  | (_| | (_| | ||  __/\\ V  V / (_| | |_| | \\__ \\ || (_| | |  | |_  |_|\n" +
                " |_| |_| |_|_| |_|\\___\\___|  \\__, |\\__,_|\\__\\___| \\_/\\_/ \\__,_|\\__, | |___/\\__\\__,_|_|   \\__| (_)\n" +
                "                              __/ |                             __/ |                            \n" +
                "                             |___/                             |___/                             \n");
    }
}