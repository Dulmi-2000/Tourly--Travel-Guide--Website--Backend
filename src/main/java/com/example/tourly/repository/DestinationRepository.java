package com.example.tourly.repository;


import com.example.tourly.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {

    Destination findByLocationName(String locationName) ;

}
