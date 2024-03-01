package com.example.cw1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${app.name}")
    public String appName;
    @Value("${app.version}")
    public String appVersion;
    

    @GetMapping("/info")
    public String getMethodName()
    {
        return ("App Name: "+appName+", Version: "+appVersion);
    }
}
