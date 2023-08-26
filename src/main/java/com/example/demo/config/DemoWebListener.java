package com.example.demo.config;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class DemoWebListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Start Application Services");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Stop Application Services");
    }
}