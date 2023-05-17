package org.acme;

import java.util.List;

public class ChatGptResponse {

    public List<ChatGptChoice> choices;

    @Override
    public String toString() {
        return choices.toString();
    }

    
}
