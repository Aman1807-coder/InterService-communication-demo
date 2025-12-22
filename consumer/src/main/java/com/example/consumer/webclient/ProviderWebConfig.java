package com.example.consumer.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProviderWebConfig {

    @Autowired
    WebClient webClient;

    public Mono<String> getInstanceInfo() {
        return webClient.get()
                .uri("/instance-info")
                .retrieve()
                .bodyToMono(String.class);
    }
}
