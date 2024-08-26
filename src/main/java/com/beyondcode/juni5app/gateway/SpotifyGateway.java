package com.beyondcode.juni5app.gateway;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
public class SpotifyGateway {


    @Value("${api.spotify.myprofile}")
    private String myProfileInfoUrl;
    private final String token = "BQAD9lCWp-8JNQpNpHcsrhdTCrJ4YiFk8M0SqO3cDS082ONVtO6nAQZHfEI-L13z8sIYTesn39ANjxxGmTmhbdyQAyO_lc5fSvcI-K3f8_X3ERB8idc";

    public WebClient getMyProfileInfo() {
        Consumer<HttpHeaders> consumer = httpHeaders -> {
            httpHeaders.add("Authorization",token);
        };
        return WebClient.builder().baseUrl(myProfileInfoUrl).defaultHeaders(consumer).build();
    }


}
