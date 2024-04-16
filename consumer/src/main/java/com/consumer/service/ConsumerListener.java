package com.consumer.service;

import com.consumer.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerListener {

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(ConsumerRecord<String, ProductDto> payload){
        System.out.println(payload.value());
    }
}
