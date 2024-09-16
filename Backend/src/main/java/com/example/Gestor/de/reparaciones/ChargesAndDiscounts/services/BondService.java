package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.services;

import com.example.Gestor.de.reparaciones.App.entities.CarEntity;
import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities.BondEntity;
import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class BondService {
    @Autowired
    private BondRepository bondRepository;

    // --------------------------CREATE--------------------------

    public BondEntity saveBond(BondEntity bond){
        return bondRepository.save(bond);
    }


    // ---------------------------READ---------------------------

    //Obtener todos los bonos
    public ArrayList<BondEntity> getBonuses(){
        return (ArrayList<BondEntity>) bondRepository.findAll();
    }

    //Obtener bono por id
    public BondEntity getBondById(Long id){
        return bondRepository.findById(id).get();
    }

    //Obtener bono por marca
    public BondEntity getBondByBrand(String brand){
        return bondRepository.findByBrand(brand);
    }

    //Obtener el monto del descuento por bonos
    public int getAmountBondDiscount(CarEntity car) {
        String marca = car.getBrand();
        return bondRepository.getAmountByBrand(marca);

    }


    // --------------------------UPDATE--------------------------

    public BondEntity updateBond(BondEntity bondEntity) {
        return bondRepository.save(bondEntity);
    }

    //Decrementa en 1 la cantidad de bonos para una marca en específico
    public void decrease(String brand) {
        BondEntity bond = bondRepository.findByBrand(brand);

        if (bond == null) {
            throw new IllegalArgumentException("La marca no existe dentro del descuento por bonos");
        }

        int quantity = bond.getQuantity();
        if (quantity > 0) {
            bond.setQuantity(quantity - 1);
            saveBond(bond);
        }

    }


    // --------------------------DELETE--------------------------

    public boolean deleteBond(Long id) throws Exception {
        try{
            bondRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }


}
