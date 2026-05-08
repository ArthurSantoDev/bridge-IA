package dev.arthur.bridge_ia.controller;

import dev.arthur.bridge_ia.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/v1/messages")
@RequiredArgsConstructor

public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public Flux<String> chat(@RequestBody String message) {
        return chatService.sendMessage(message);
    }
}



