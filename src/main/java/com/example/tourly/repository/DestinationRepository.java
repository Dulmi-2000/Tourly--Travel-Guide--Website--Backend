package com.example.tourly.repository;


import com.example.tourly.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DestinationRepository extends JpaRepository<Destination, Long> {



    Destination findByLocationName(String locationName);


    Destination findFirstByLoctype(String loctype);

    List<Destination> findByLoctype(String loctype);
}
