package com.example.Gestor.de.reparaciones.repositories;

import com.example.Gestor.de.reparaciones.entities.BondDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondDataRepository extends JpaRepository<BondDataEntity, Long> {
    public BondDataEntity findByMarcaAutomovil(String marca);
    //public DatosBonosEntity findById(long id);

}
