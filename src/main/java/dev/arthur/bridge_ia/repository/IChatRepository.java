package dev.arthur.bridge_ia.repository;

import dev.arthur.bridge_ia.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChatRepository extends JpaRepository<ChatMessage, Long> {
}
