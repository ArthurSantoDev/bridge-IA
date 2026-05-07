package dev.arthur.bridge_ia.service;

import dev.arthur.bridge_ia.model.ClaudeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AIClientService {

    private final WebClient webClient;

    @Value("${anthropic.api-key}")
    private String apiKey;

    @Value("${anthropic.model}")
    private String model;

    public Flux<String> sendToClaud(String message) {

        var request = new ClaudeRequest(
                model,
                1024,
                List.of(new ClaudeRequest.Message("user", message))
        );

        return webClient
                .post()
                .uri("https://api.anthropic.com/v1/messages")
                .header("x-api-key", apiKey)
                .header("anthropic-version", "2023-06-01")
                .header("Content-Type", "application/json")
                .bodyValue(request)
                .retrieve()
                .bodyToFlux(String.class);



    }
}
