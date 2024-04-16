package com.producer.controller;

import com.producer.dto.ProductDto;
import com.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/send")
    public ProductDto send(@RequestBody ProductDto message){
        producerService.send(message);
        return message;
    }
}
