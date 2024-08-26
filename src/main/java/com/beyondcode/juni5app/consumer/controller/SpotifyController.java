package com.beyondcode.juni5app.consumer.controller;


import com.beyondcode.juni5app.service.SpotifyService;
import com.beyondcode.juni5app.model.SpotifyUser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SpotifyController {

    private final SpotifyService spotifyService;

    @GetMapping(value = "")
    public ResponseEntity<SpotifyUser> getMySpotifyInfo(){

        return new ResponseEntity<SpotifyUser>(spotifyService.getSpotifyUser());
    }

}
