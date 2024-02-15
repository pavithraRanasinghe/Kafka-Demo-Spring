package com.unkown.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "test", groupId = "testGroup")
    void listener(String data){
        System.out.println("Received from topic "+ data);
    }
}
