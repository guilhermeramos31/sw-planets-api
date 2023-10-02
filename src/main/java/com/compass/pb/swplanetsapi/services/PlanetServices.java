package com.compass.pb.swplanetsapi.services;

import com.compass.pb.swplanetsapi.models.dtos.PlanetRequestDTO;
import com.compass.pb.swplanetsapi.models.dtos.PlanetResponseDTO;
import com.compass.pb.swplanetsapi.repositorys.PlanetRepository;

import java.util.List;
import java.util.Optional;

public class PlanetServices {
    private PlanetRepository planetRepository;
    public PlanetServices(PlanetRepository planetRepository){
        this.planetRepository = planetRepository;
    }
    public Optional<PlanetRepository> findById(PlanetResponseDTO entity){
        return planetRepository.findById(entity.getId());
    }
    public List<PlanetResponseDTO> findAll(){
        return planetRepository.findAll();
    }
    public void save(PlanetRequestDTO planetRequestDTO){
        if (planetRequestDTO.getClimate() == "" && planetRequestDTO.getName() == "" && planetRequestDTO.getTerrain() == ""){
            planetRepository.save(planetRequestDTO);
        }
    }
}
