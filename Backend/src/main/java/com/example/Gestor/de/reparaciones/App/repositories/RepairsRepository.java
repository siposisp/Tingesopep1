package com.example.Gestor.de.reparaciones.App.repositories;

import com.example.Gestor.de.reparaciones.App.entities.RepairsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairsRepository extends JpaRepository<RepairsEntity, Long> {
}
