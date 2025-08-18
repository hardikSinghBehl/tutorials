package com.baeldung.springai;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StoryGeneratorController {

    private final StoryGenerator storyGenerator;

    StoryGeneratorController(StoryGenerator storyGenerator) {
        this.storyGenerator = storyGenerator;
    }

    @PostMapping("/v1/generate")
    ResponseEntity<String> generateStory() {
        return ResponseEntity.ok(storyGenerator.generate());
    }

}