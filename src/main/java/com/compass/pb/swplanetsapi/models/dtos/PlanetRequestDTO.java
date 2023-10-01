package com.compass.pb.swplanetsapi.models.dtos;


import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlanetRequestDTO {
    @Nonnull
    private Long id;
    @Nonnull
    private String name;
    @Nonnull
    private String climate;
    @Nonnull
    private String terrain;
}
