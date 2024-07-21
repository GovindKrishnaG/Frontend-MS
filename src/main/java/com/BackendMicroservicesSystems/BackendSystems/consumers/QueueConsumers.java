package com.BackendMicroservicesSystems.BackendSystems.consumers;

import com.BackendMicroservicesSystems.BackendSystems.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class QueueConsumers {

    @JmsListener(destination = Constants.JmsQueueName)
    private void jmsListner(String jmsMessage){

      log.info("Message Received {}", jmsMessage);
  }
}
