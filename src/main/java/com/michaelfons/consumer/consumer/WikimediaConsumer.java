package com.michaelfons.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaConsumer {
    @KafkaListener(topics = "wikimedia-stream", groupId = "message_group_id")
    public void consumeMsg(String msg) {
        System.out.println(msg);
        // TODO persist to mongodb
    }
}
