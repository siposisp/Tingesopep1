package com.example.Gestor.de.reparaciones.ValuesAndConstants.repositories;

import com.example.Gestor.de.reparaciones.ValuesAndConstants.entities.BondEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondRepository extends JpaRepository<BondEntity, Long> {

    public BondEntity findByBrand(String brand);
    //public DatosBonosEntity findById(long id);

}
