package com.example.chatroom.model;

import com.example.chatroom.codes.ChatType;
import lombok.Data;

@Data
public class ChatMessage {
    private ChatType chatType;
    private String message;
    private String content;
}
