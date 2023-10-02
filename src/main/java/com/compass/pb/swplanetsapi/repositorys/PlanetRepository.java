package com.compass.pb.swplanetsapi.repositorys;

import com.compass.pb.swplanetsapi.models.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
