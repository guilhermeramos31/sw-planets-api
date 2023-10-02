package com.compass.pb.swplanetsapi.models.dtos;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanetResponseDTO {
    private Long id;
    private String name;
    private String climate;
    private String terrain;
}
