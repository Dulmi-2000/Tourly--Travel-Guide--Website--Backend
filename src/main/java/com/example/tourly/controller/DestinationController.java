package com.example.tourly.controller;

import com.example.tourly.exception.LocationNameNotFoundException;
import com.example.tourly.model.Destination;
import com.example.tourly.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin("http://localhost:3000")
@RestController
public class DestinationController {


    @Autowired
    private DestinationRepository destinationRepository;

    //add data
    @PostMapping("/destination")
    public Destination newDestination(@RequestBody Destination newDestination) {
        return destinationRepository.save(newDestination);
    }

    //get all data
    @GetMapping("/destinations")
    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    //get by location name
    @GetMapping("/destination/{locationName}")
    public ResponseEntity<Destination> getDestinationByLocationName(@PathVariable String locationName) {
        Optional<Destination> destination = Optional.ofNullable(destinationRepository.findByLocationName(locationName));
        return destination.map(ResponseEntity::ok)
                .orElseThrow(() -> new LocationNameNotFoundException(locationName));
    }



    /*
@GetMapping("/destination/{locationName}")
Destination getDestinationbyLocationName(@PathVariable String locationName){
    return DestinationRepository.findByLocationName(locationName)
            .orElseThrow(()->new LocationNameNotFoundException(locationName));
}*/





}
