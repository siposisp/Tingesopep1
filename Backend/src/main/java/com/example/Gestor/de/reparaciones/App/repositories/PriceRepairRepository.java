package com.example.Gestor.de.reparaciones.App.repositories;

import com.example.Gestor.de.reparaciones.App.entities.PriceRepairsEntity;
import com.example.Gestor.de.reparaciones.App.entities.RepairHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PriceRepairRepository extends JpaRepository<PriceRepairsEntity, Long> {
    @Query(value = "SELECT * FROM priceRepairs " + "WHERE engine = :engine", nativeQuery = true)
    public List<PriceRepairsEntity> getAmountByEngineType(@Param("engine") String patent);

}
