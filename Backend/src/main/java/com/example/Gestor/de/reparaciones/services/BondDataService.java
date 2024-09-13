package com.example.Gestor.de.reparaciones.services;

import com.example.Gestor.de.reparaciones.entities.BondDataEntity;
import com.example.Gestor.de.reparaciones.repositories.BondDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class BondDataService {
    @Autowired
    private BondDataRepository bondDataRepository;

    public ArrayList<BondDataEntity> getDatosBonos(){
        return (ArrayList<BondDataEntity>) bondDataRepository.findAll();
    }
    public BondDataEntity saveDatosBonos(BondDataEntity datosBono){
        return bondDataRepository.save(datosBono);
    }

    public BondDataEntity updateDatosBonos(BondDataEntity bondDataEntity) {
        return bondDataRepository.save(bondDataEntity);
    }
    public BondDataEntity getDatosBonosById(Long id){
        return bondDataRepository.findById(id).get();
    }
    public BondDataEntity getDatosBonosByMarca(String marca){
        return bondDataRepository.findByMarcaAutomovil(marca);
    }

    public boolean deleteDatosBonos(Long id) throws Exception {
        try{
            bondDataRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
