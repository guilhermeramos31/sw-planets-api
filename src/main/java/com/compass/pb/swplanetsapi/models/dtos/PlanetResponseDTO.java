package com.compass.pb.swplanetsapi.models.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlanetResponseDTO {
    private Long id;
    private String name;
    private String climate;
    private String terrain;
}
