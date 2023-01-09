package com.cap.topictester.controller;

import com.cap.topictester.logic.TopicTesterService;
import com.cap.topictester.request.ShopOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topic")
public class TopicTesterController {

    @Autowired
    private TopicTesterService topicTesterService;

    @PostMapping("/{topic}/send")
    public ResponseEntity<HttpStatus> purchase(@PathVariable String topic, @RequestBody ShopOrderRequest request) {

        topicTesterService.sendMessage(topic, request);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
