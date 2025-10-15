package org.example.Service;

import org.example.api.DataRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class ServiceWebClient {
    private final WebClient webClient;

    public DataRequest getDataRequest() {
        return webClient.get()
                .uri("/data")
                .retrieve()
                .bodyToMono(DataRequest.class)
                .block();
    }
}
