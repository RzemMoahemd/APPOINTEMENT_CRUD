package com.example.location;

import com.netflix.discovery.converters.Auto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService {

    @Autowired
    private final LocationRepository repository;

    public void saveLocation(Location location){
        repository.save(location);
    }

    public List<Location> findAlllocations(){
        return repository.findAll();
    }

}
