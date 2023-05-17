package org.acme;

public class ChatGptMessage {

    public String role;
    public String content;

    public ChatGptMessage() {}

    public ChatGptMessage(String role, String content) {
        this.role = role;
        this.content = content;
    }

    @Override
    public String toString() {
        return role + " : " + content;
    }

}
