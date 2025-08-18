package com.baeldung.springai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
class StoryGenerator {

    private final ChatClient chatClient;

    StoryGenerator(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    String generate() {
        return chatClient
            .prompt("Write a random funny greentext story.")
            .call()
            .content();
    }


}