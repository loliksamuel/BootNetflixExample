package com.example.serviceeureka;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String greeting2() {
        System.out.println(eurekaClient.getApplication(appName).getName());
        System.out.println(eurekaClient.getInstanceRemoteStatus());
        System.out.println(eurekaClient.getAllKnownRegions());
        System.out.println(eurekaClient.getApplicationInfoManager().getEurekaInstanceConfig());
        System.out.println(eurekaClient.getApplications());
        System.out.println(eurekaClient.getEurekaClientConfig());
        System.out.println(eurekaClient.getHealthCheckHandler());


        return String.format("Hello. i am '%s'!", eurekaClient.getApplication(appName).getName());
    }
    @RequestMapping("/reservation")
    public String greeting() {
        return String.format("Hello. i am '%s'!", eurekaClient.getApplication(appName).getName());
    }
}