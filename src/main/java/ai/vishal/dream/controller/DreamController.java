package ai.vishal.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import ai.vishal.dream.model.request.DreamDTO;
import ai.vishal.dream.model.request.GPTRequest;
import reactor.core.publisher.Mono;

@RestController
public class DreamController {

    @Value("${bearer}")
    String token;

    @Autowired
    WebClient.Builder webClientBuilder;

    @PostMapping("/dream")
    public Object analyseDream(DreamDTO dream) {
        GPTRequest gptRequest = new GPTRequest();
        gptRequest.setPrompt(dream.getMessage());

        return webClientBuilder.build()
                .post()
                .uri("https://api.openai.com/v1/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .headers(h -> h.setBearerAuth(token))
                .body(Mono.just(gptRequest), GPTRequest.class)
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }
}
