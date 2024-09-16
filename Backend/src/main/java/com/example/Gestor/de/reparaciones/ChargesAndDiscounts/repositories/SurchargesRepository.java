package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities.ConstantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurchargesRepository extends JpaRepository<ConstantsEntity, Long> {
}
