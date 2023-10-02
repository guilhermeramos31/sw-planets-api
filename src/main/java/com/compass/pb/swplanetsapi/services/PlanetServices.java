package com.compass.pb.swplanetsapi.services;

import com.compass.pb.swplanetsapi.exceptions.PlanetNotFoundException;
import com.compass.pb.swplanetsapi.models.dtos.PlanetRequestDTO;
import com.compass.pb.swplanetsapi.models.dtos.PlanetResponseDTO;
import com.compass.pb.swplanetsapi.repositorys.PlanetRepository;
import com.compass.pb.swplanetsapi.services.assembler.PlanetDTOAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanetServices {
    private final PlanetRepository planetRepository;
    private final PlanetDTOAssembler planetDTOAssembler;
    public PlanetResponseDTO findById(Long id) {
        var planet = planetRepository.findById(id).orElseThrow(PlanetNotFoundException::new);
        return planetDTOAssembler.toDTO(planet);
    }
    public List<PlanetResponseDTO> findAll(){
        return planetDTOAssembler.toDTO(planetRepository.findAll());
    }
    public void save(PlanetRequestDTO planetRequestDTO){
        var assembler = planetDTOAssembler.toModel(planetRequestDTO);
        if (!planetRequestDTO.getClimate().isEmpty() && !planetRequestDTO.getName().isEmpty() && !planetRequestDTO.getTerrain().isEmpty()){
            planetRepository.save(assembler);
        }
    }
}
