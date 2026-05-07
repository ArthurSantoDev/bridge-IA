package dev.arthur.bridge_ia.model;

import org.aspectj.bridge.Message;

public record ClaudeRequest(

        String model,
        int maxTokens,
        List<Message> messages

) {

    public record Message(
            String role,
            String content
    ) {}

}
