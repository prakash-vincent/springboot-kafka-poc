package com.kafkaexample.springbootkafkapoc;

import com.kafkaexample.springbootkafkapoc.service.KafkaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/producer")
public class Controller {

    private final KafkaProducer kafkaProducer;

    public Controller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        kafkaProducer.publishMessage(message);
        return "Message published successfully";
    }
}
