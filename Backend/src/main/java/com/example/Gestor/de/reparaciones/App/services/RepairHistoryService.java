package com.example.Gestor.de.reparaciones.App.services;

import com.example.Gestor.de.reparaciones.App.entities.PriceRepairsEntity;
import com.example.Gestor.de.reparaciones.App.entities.RepairHistoryEntity;
import com.example.Gestor.de.reparaciones.App.repositories.RepairHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RepairHistoryService {

    @Autowired
    RepairHistoryRepository repairHistoryRepository;

    public ArrayList<RepairHistoryEntity> getRepairHistories() {
        return (ArrayList<RepairHistoryEntity>) repairHistoryRepository.findAll();
    }

    public RepairHistoryEntity saveRepairHistory(RepairHistoryEntity repairHistory) {
        return repairHistoryRepository.save(repairHistory);
    }

    public List<RepairHistoryEntity> getRepairHistoriesByPatente(String patent) {
        return repairHistoryRepository.findAllByPatent(patent);
    }

    public RepairHistoryEntity getRepairHistoryNotPaidByPatent(String patente) {
        return repairHistoryRepository.findByPatentAndStateFalse(patente);
    }


    public Optional<RepairHistoryEntity> getRepairHistoryById(Long id) {
        return repairHistoryRepository.findById(id);
    }

    public RepairHistoryEntity updateRepairHistory(RepairHistoryEntity repairHistory) {
        return repairHistoryRepository.save(repairHistory);
    }

    public boolean deleteRepairHistory(Long id) throws Exception {
        try{
            repairHistoryRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    // Cambia el estado del pago, de false(no pagado) a true(pagado)
    public Boolean pay(String patente) {
        RepairHistoryEntity historial = getRepairHistoryNotPaidByPatent(patente);
        if (historial != null && historial.getPaymentDetails().getTotal() > 0 && !historial.isState()) { //No se porque, pero no funciona !historial.isState()
            historial.setState(true);
            repairHistoryRepository.save(historial);
            return true;
        }
        return false;
    }




}
