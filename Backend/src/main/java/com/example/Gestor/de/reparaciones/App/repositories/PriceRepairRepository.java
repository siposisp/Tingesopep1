package com.example.Gestor.de.reparaciones.App.repositories;

import com.example.Gestor.de.reparaciones.App.entities.PriceRepairsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepairRepository extends JpaRepository<PriceRepairsEntity, Long> {
}
