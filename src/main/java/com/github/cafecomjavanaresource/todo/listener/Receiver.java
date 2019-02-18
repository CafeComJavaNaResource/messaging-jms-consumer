package com.github.cafecomjavanaresource.todo.listener;

import com.github.cafecomjavanaresource.todo.message.data.TodoMessage;
import lombok.extern.java.Log;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Log
public class Receiver {

    @JmsListener(destination = "todo-channel", containerFactory = "myFactory")
    public void receiveMessage(TodoMessage todo) {
        log.info(String.format("#### Received todo: < %s >", todo));
    }

}
