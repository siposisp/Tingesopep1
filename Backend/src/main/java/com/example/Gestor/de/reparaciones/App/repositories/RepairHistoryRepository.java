package com.example.Gestor.de.reparaciones.App.repositories;

import com.example.Gestor.de.reparaciones.App.entities.RepairHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairHistoryRepository extends JpaRepository<RepairHistoryEntity, Long>  {

    @Query(value = "SELECT * FROM repairHistory " + "WHERE patent = :patent", nativeQuery = true)
    public List<RepairHistoryEntity> findAllByPatent(@Param("patent") String patent);

    @Query(value = "SELECT * FROM repairHistory " +
            "WHERE patent = :patent AND state = false", nativeQuery = true)
    public RepairHistoryEntity findByPatentAndStateFalse(@Param("patent") String patent);
}
