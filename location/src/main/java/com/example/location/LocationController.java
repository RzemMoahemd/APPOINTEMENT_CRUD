package com.example.location;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Location location){
        service.saveLocation(location);
    }

    @GetMapping
    public ResponseEntity<List<Location>> findAlllocations(){
        return ResponseEntity.ok(service.findAlllocations());
    }

}
