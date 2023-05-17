package org.acme;

public class ChatGptChoice {

    public int index;
    public ChatGptMessage message;
    @Override
    public String toString() {
        return message.toString();
    }

    

}
