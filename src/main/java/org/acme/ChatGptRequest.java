package org.acme;

import java.util.ArrayList;
import java.util.List;

public class ChatGptRequest {

    public String model;
    public List<ChatGptMessage> messages;

    public ChatGptRequest(String model, String prompt) {
        this.model = model;
        
        this.messages = new ArrayList<>();
        this.messages.add(new ChatGptMessage("user", prompt));
    }

}
