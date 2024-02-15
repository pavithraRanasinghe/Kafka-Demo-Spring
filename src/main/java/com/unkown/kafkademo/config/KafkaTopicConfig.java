package com.unkown.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    /**
     * Create the kafka TOPIC
     *
     * @return the kafka Topic
     */
    @Bean
    public NewTopic testTopic() {
        return TopicBuilder.name("test")
                .build();
    }
}
