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
    public PlanetResponseDTO toResponseDTO(Planet planet){
        return modelMapper.map(planet, PlanetResponseDTO.class);
    }
    public PlanetRequestDTO toRequestDTO(Planet planet){
        return modelMapper.map(planet, PlanetRequestDTO.class);
    }

    public Planet requestDTOToModel(PlanetRequestDTO planet){
        return modelMapper.map(planet, Planet.class);
    }
    public Planet responseDTOToModel(PlanetResponseDTO planet){
        return modelMapper.map(planet, Planet.class);
    }
    public List<PlanetResponseDTO> modelToResponseDTO(List<Planet> planets){
        List<PlanetResponseDTO> planetsDTO = new ArrayList<>();
        planets.forEach( e -> planetsDTO.add(toResponseDTO(e)));
        return planetsDTO;
    }

    public List<PlanetRequestDTO> modelToRequestDTO(List<Planet> planets){
        List<PlanetRequestDTO> planetsDTO = new ArrayList<>();
        planets.forEach( e -> planetsDTO.add(toRequestDTO(e)));
        return planetsDTO;
    }
}
