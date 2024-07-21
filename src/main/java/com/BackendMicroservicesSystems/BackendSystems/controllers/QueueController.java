package com.BackendMicroservicesSystems.BackendSystems.controllers;

import com.BackendMicroservicesSystems.BackendSystems.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messaging")
@RequiredArgsConstructor
public class QueueController {

    private final JmsTemplate jmsTemplate;


    @PostMapping("/activemq/publish")
    private String jmsPublisher(@RequestParam String requestMessage){

        jmsTemplate.convertAndSend(Constants.JmsQueueName,requestMessage);

        return "Message has been published: " + requestMessage;
    }
}
