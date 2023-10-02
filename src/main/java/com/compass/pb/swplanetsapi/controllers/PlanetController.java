package com.compass.pb.swplanetsapi.controllers;

import com.compass.pb.swplanetsapi.models.dtos.PlanetResponseDTO;
import com.compass.pb.swplanetsapi.services.PlanetServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/planets")
public class PlanetController {
    private final PlanetServices planetServices;

    @GetMapping("{/planetId}")
    public ResponseEntity<PlanetResponseDTO> getIdPlanet(@PathVariable Long planetId) throws Throwable {
        return ResponseEntity.ok(planetServices.findById(planetId));
    }
}
