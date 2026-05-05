package dev.arthur.bridge_ia.service;

import dev.arthur.bridge_ia.repository.IChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final IChatRepository chatRepository;
    private final AIClientService aiClientService;

}
