package com.compass.pb.swplanetsapi.models.dtos;


import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
