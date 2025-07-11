package com.springboot.restapi.kafka.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

//    @kafkaListener annotation will set this method to listen mentioned topic

    @KafkaListener(topics = AppConstant.LOCATION_TOPIC_NAME, groupId = AppConstant.GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);
    }
}
