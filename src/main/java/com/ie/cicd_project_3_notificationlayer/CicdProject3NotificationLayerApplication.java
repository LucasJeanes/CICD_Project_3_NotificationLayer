package com.ie.cicd_project_3_notificationlayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CicdProject3NotificationLayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdProject3NotificationLayerApplication.class, args);
    }

}
