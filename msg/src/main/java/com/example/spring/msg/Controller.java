package com.example.spring.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class Controller {

    @Autowired
    private Producer producer;

    @GetMapping
    public ResponseEntity<?> send(@RequestParam("msg") String msg)
    {
        System.err.println("Msg In Controller" + msg);
        this.producer.sendMessage(msg);
        return ResponseEntity.ok("");
    }
    
}
