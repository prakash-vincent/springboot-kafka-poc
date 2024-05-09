package com.kafkaexample.springbootkafkapoc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demo_topic", groupId = "demo_cg1")
    public void listener(String receivedMessage) {
        System.out.println("Message received in KafkaConsumer.listener " + receivedMessage);
    }
}
