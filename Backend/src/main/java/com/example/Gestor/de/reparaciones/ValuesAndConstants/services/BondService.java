package com.example.Gestor.de.reparaciones.ValuesAndConstants.services;

import com.example.Gestor.de.reparaciones.ValuesAndConstants.entities.BondEntity;
import com.example.Gestor.de.reparaciones.ValuesAndConstants.repositories.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class BondService {
    @Autowired
    private BondRepository bondRepository;

    public ArrayList<BondEntity> getBonuses(){
        return (ArrayList<BondEntity>) bondRepository.findAll();
    }
    public BondEntity saveBound(BondEntity datosBono){
        return bondRepository.save(datosBono);
    }
    public BondEntity updateBound(BondEntity bondEntity) {
        return bondRepository.save(bondEntity);
    }
    public BondEntity getBoundById(Long id){
        return bondRepository.findById(id).get();
    }
    public BondEntity getBoundByBrand(String brand){
        return bondRepository.findByBrand(brand);
    }

    public boolean deleteBound(Long id) throws Exception {
        try{
            bondRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
