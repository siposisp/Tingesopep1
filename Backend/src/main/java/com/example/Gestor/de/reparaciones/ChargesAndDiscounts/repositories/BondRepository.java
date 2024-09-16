package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities.BondEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BondRepository extends JpaRepository<BondEntity, Long> {

    public BondEntity findByBrand(String brand);
    //public DatosBonosEntity findById(long id);

    //Obtener monto según la marca
    @Query(value = "SELECT amount " +
            "FROM bonuses " +
            "WHERE brand = :brand", nativeQuery = true)
    int getAmountByBrand(@Param("brand") String brand);

}
