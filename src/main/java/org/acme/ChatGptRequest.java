package org.acme;

import java.util.ArrayList;
import java.util.List;

public record ChatGptRequest(String model, List<ChatGptMessage> messages) {

    public static ChatGptRequest newRequest(String model, String prompt) {
        final List<ChatGptMessage> messages = new ArrayList<>();
        messages.add(new ChatGptMessage("user", prompt));
        return new ChatGptRequest(model, messages);
    }

}
