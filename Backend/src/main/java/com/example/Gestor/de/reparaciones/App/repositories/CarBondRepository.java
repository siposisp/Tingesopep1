package com.example.Gestor.de.reparaciones.App.repositories;

import com.example.Gestor.de.reparaciones.App.entities.CarBondEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CarBondRepository extends JpaRepository<CarBondEntity, Long> {

    //Verificar si un automovil ha tenido un descuento en los últimos 30 días
    @Query(value = "SELECT CASE WHEN COUNT(*) > 0 THEN TRUE ELSE FALSE END " +
            "FROM carBond " +
            "WHERE patent = :patent" +
            "AND dateCarBond >= NOW() - INTERVAL '30 days'", nativeQuery = true)
    boolean checkDiscountLast30Days(@Param("patent") String patent);

}
