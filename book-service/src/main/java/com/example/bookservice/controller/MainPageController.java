package com.example.bookservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MainPageController {

    private static final Logger LOG = Logger.getLogger(MainPageController.class.getName());

    private Environment env;

    public MainPageController(Environment env) {
        this.env = env;
    }

    @RequestMapping("/")
    public String home() {
        String home = "Client-Service running at port: " + env.getProperty("local.server.port");
        LOG.log(Level.WARNING, home);

        return home;
    }
}
