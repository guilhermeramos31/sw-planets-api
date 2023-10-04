package com.compass.pb.swplanetsapi.controllers;

import com.compass.pb.swplanetsapi.models.dtos.PlanetRequestDTO;
import com.compass.pb.swplanetsapi.models.dtos.PlanetResponseDTO;
import com.compass.pb.swplanetsapi.services.PlanetServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/planets")
public class PlanetController {
    private final PlanetServices planetServices;

    @GetMapping("/{planetId}")
    public ResponseEntity<PlanetResponseDTO> getIdPlanet(@PathVariable Long planetId) {
        return ResponseEntity.ok(planetServices.findById(planetId));
    }
    @PostMapping
    public ResponseEntity<PlanetRequestDTO> postPlanet(@RequestBody  @Validated PlanetRequestDTO planet){
        return ResponseEntity.status(HttpStatus.CREATED).body(planetServices.save(planet));
    }
}
