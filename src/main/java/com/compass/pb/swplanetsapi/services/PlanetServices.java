package com.compass.pb.swplanetsapi.services;

import com.compass.pb.swplanetsapi.exceptions.*;
import com.compass.pb.swplanetsapi.models.dtos.PlanetRequestDTO;
import com.compass.pb.swplanetsapi.models.dtos.PlanetResponseDTO;
import com.compass.pb.swplanetsapi.models.entity.Planet;
import com.compass.pb.swplanetsapi.repositorys.PlanetRepository;
import com.compass.pb.swplanetsapi.services.assembler.PlanetDTOAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanetServices {
    private final PlanetRepository planetRepository;
    private final PlanetDTOAssembler planetDTOAssembler;
    public PlanetResponseDTO findById(Long id) {
        var planet = planetRepository.findById(id).orElseThrow(PlanetNotFoundException::new);
        return planetDTOAssembler.toResponseDTO(planet);
    }
    public List<PlanetResponseDTO> findAll(){
        return planetDTOAssembler.modelToResponseDTO(planetRepository.findAll());
    }
    public PlanetRequestDTO save(PlanetRequestDTO planetRequestDTO){
        var assembler = planetDTOAssembler.requestDTOToModel(planetRequestDTO);
        PlanetRequestDTO planetResponse = planetDTOAssembler.toRequestDTO(planetRepository.save(assembler));
        if (planetResponse.getName().isBlank()) throw new NameFormatNotAcceptableException();
        if (planetResponse.getClimate().isBlank()) throw new ClimateFormatNotAcceptableException();
        if (planetResponse.getTerrain().isBlank()) throw new TerrainFormatNotAcceptableException();
        return planetResponse;
    }
}
