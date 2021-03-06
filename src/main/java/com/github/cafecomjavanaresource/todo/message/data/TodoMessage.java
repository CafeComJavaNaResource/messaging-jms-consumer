package com.github.cafecomjavanaresource.todo.message.data;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true)
public class TodoMessage {

    private String description;

}
