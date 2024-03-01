package com.example.cw1.config;

import org.springframework.beans.factory.annotation.Value;

public class AppConfig {
    @Value("${app.name}")
    public String appName;
    @Value("${app.version}")
    public String appVersion;
    
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
    public AppConfig(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }
}
