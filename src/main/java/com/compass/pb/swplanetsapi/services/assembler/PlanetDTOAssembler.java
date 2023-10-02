package com.compass.pb.swplanetsapi.services.assembler;

import com.compass.pb.swplanetsapi.models.dtos.PlanetRequestDTO;
import com.compass.pb.swplanetsapi.models.dtos.PlanetResponseDTO;
import com.compass.pb.swplanetsapi.models.entity.Planet;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PlanetDTOAssembler {
    private final ModelMapper modelMapper;
    public PlanetResponseDTO toDTO(Planet planet){
        return modelMapper.map(planet, PlanetResponseDTO.class);
    }
    public Planet toModel(PlanetRequestDTO planetRequestDTO){
        return modelMapper.map(planetRequestDTO, Planet.class);
    }
    public List<PlanetResponseDTO> toDTO(List<Planet> planets){
        List<PlanetResponseDTO> planetsDTO = new ArrayList<>();
        planets.forEach( e -> planetsDTO.add(toDTO(e)));
        return planetsDTO;
    }
}
