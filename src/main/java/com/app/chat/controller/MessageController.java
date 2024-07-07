package com.app.chat.controller;

import com.app.chat.model.Messsage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Messsage getContent(@RequestBody Messsage message){

        try {
            Thread.sleep ( 0 );
        }
        catch ( InterruptedException e ) {
            e.printStackTrace ();
        }
            return message;
    }
}
