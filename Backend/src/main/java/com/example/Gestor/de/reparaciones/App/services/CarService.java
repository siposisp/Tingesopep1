package com.example.Gestor.de.reparaciones.App.services;

import com.example.Gestor.de.reparaciones.App.entities.CarEntity;
import com.example.Gestor.de.reparaciones.App.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    // --------------------------CREATE--------------------------

    public CarEntity saveCar(CarEntity car){
        return carRepository.save(car);
    }


    // ---------------------------READ---------------------------

    public ArrayList<CarEntity> getCars(){
        return (ArrayList<CarEntity>) carRepository.findAll();
    }

    public CarEntity getCarById(Long id){
        return carRepository.findById(id).get();
    }

    public CarEntity getCarByPatent(String patent){
        return carRepository.findByPatent(patent);
    }


    // --------------------------UPDATE--------------------------

    public CarEntity updateCar(CarEntity car) {
        return carRepository.save(car);
    }


    // --------------------------DELETE--------------------------

    public boolean deleteCar(Long id) throws Exception {
        try{
            carRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public boolean deleteCarByPatent(String patent) throws Exception {
        try{
            carRepository.deleteCarByPatent(patent);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
