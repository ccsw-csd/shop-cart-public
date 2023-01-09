package com.cap.topictester.logic;

import com.cap.topictester.producer.KafkaProducer;
import com.cap.topictester.request.ShopOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicTesterService {

    @Autowired
    private KafkaProducer kafkaProducer;

    public void sendMessage(String topic, ShopOrderRequest request) {

        kafkaProducer.sendMessage(topic, request);
    }
}
