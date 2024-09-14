package com.example.Gestor.de.reparaciones.App.repositories;

import com.example.Gestor.de.reparaciones.App.entities.CarEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    public CarEntity findById(long id);
    public CarEntity findByPatent(String patent);
    public CarEntity findByYear(int year);

    @Query(value = "DELETE FROM cars WHERE patent = :patent", nativeQuery = true)
    @Modifying
    @Transactional
    void deleteCarByPatent(@Param("patent") String patent);
}
