package com.example.Gestor.de.reparaciones.repositories;

import com.example.Gestor.de.reparaciones.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    public CarEntity findById(long id);
    public CarEntity findByPatent(String patent);
    public CarEntity findByYear(int year);
    public CarEntity deleteCarByPatent(String patent);
}
