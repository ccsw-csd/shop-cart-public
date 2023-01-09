package com.cap.topictester.consumer;

import com.cap.topictester.request.ShopOrderRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

  ObjectMapper mapper = new ObjectMapper();

  @KafkaListener(topics = "XXX")
  public void listener(String message) {

    try {
      System.out.println("Message has been received: " + message);
      ShopOrderRequest request = mapper.readValue(message, ShopOrderRequest.class);

      //TODO: Funcionalidad

    } catch (JsonProcessingException e) {
      System.out.println("Error parsing request");
    }
  }

}