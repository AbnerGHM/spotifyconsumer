package com.beyondcode.juni5app.service;


import com.beyondcode.juni5app.gateway.SpotifyGateway;
import com.beyondcode.juni5app.model.SpotifyUser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpotifyService {

    private final SpotifyGateway spotifyGateway;
    public ResponseEntity<SpotifyUser> getSpotifyUser(){

        return spotifyGateway.getMyProfileInfo();
    }


}
