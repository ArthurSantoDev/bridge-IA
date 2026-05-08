package dev.arthur.bridge_ia.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record ClaudeRequest(

        String model,
        @JsonProperty("max_tokens") int maxTokens,
        List<Message> messages

) {

    public record Message(
            String role,
            String content
    ) {}

}
