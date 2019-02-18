package com.github.cafecomjavanaresource.todo.listener;

import com.github.cafecomjavanaresource.todo.message.data.TodoMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ReceiverTest {

    @Mock
    private Receiver receiver;

    @Test
    public void receiveMessage() {

        receiver.receiveMessage(TodoMessage.builder().description("desc").build());
    }
}