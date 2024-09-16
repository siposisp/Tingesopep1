package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities.ConstantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountsRepository  extends JpaRepository<ConstantsEntity, Long> {

    //Obtener porcentaje según el tipo de motor
    @Query(value = "SELECT percentage " +
            "FROM discounts " +
            "WHERE engine = :engine AND type = 'day'" +
            "AND min =< :quantity AND max => :quantity",
            nativeQuery = true)
            double getAmountByEngineType(@Param("engine") String engine, @Param("quantity") int quantity);

    //Obtener porcentaje para día de la semana
    @Query(value = "SELECT percentage " +
            "FROM discounts " +
            "WHERE type = :type", nativeQuery = true)
            double getAmountByDayType(@Param("type") String type);
}
