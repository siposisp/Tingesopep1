package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities.ConstantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstantsRepository  extends JpaRepository<ConstantsEntity, Long> {


    //Obtener monto según el tipo
    @Query(value = "SELECT percentage " +
            "FROM constants " +
            "WHERE type = :type", nativeQuery = true)
    double getAmountByType(@Param("type") String type);


}
