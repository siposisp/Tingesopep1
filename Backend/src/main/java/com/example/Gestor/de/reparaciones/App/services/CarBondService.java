package com.example.Gestor.de.reparaciones.App.services;

import com.example.Gestor.de.reparaciones.App.entities.CarBondEntity;
import com.example.Gestor.de.reparaciones.App.repositories.CarBondRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CarBondService {
    @Autowired
    private CarBondRepository carBondRepository;

    // --------------------------CREATE--------------------------

    public CarBondEntity saveCarBond(CarBondEntity carBond) {
        if (checkDiscountLast30Days(carBond.getPatent())) {
            throw new IllegalArgumentException("El auto ya ha tenido un descuento en los últimos 30 días");
        }
        return carBondRepository.save(carBond);
    }


    // ---------------------------READ---------------------------

    //Verificar si un automovil ha tenido un descuento en los últimos 30 días
    public boolean checkDiscountLast30Days (String patent){
        return carBondRepository.checkDiscountLast30Days(patent);
    }


    // --------------------------UPDATE--------------------------

    // --------------------------DELETE--------------------------



}



    // --------------------------CREATE--------------------------

    // ---------------------------READ---------------------------

    // --------------------------UPDATE--------------------------

    // --------------------------DELETE--------------------------
