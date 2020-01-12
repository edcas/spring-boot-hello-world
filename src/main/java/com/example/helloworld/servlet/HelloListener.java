package com.example.helloworld.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet context destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Servlet initialized");
    }
}
