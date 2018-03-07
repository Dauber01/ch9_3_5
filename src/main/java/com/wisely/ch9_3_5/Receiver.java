package com.wisely.ch9_3_5;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * rabbitMQ的消息接收类
 * @author Lucifer
 * @date 2018/03/07 14:25
 */
@Component
public class Receiver {

    @RabbitListener(queues = "my-queue")
    public void receiveMessage(String message){
        System.out.println("Receiver<" +  message + ">");
    }

}
