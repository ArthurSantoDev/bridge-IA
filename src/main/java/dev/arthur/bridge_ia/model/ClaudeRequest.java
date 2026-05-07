package dev.arthur.bridge_ia.model;

import java.util.List;

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
