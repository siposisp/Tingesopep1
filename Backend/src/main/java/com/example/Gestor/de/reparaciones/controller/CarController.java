package com.example.Gestor.de.reparaciones.controller;

import com.example.Gestor.de.reparaciones.entities.CarEntity;
import com.example.Gestor.de.reparaciones.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@CrossOrigin("*")
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/")
    public ResponseEntity<List<CarEntity>> carsList() {
        List<CarEntity> cars = carService.getCars();
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarEntity> getCarById(@PathVariable Long id) {
        CarEntity car = carService.getCarById(id);
        return ResponseEntity.ok(car);
    }


    @GetMapping("/patent/{patent}")
    public ResponseEntity<CarEntity> getCarByPatent(@PathVariable String patent) {
        CarEntity car = carService.getCarByPatent(patent);
        return ResponseEntity.ok(car);
    }


    @PostMapping("/")
    public ResponseEntity<CarEntity> saveCar(@RequestBody CarEntity car) {
        CarEntity newCar = carService.saveCar(car);
        return ResponseEntity.ok(newCar);
    }

    @PutMapping("/")
    public ResponseEntity<CarEntity> updateCar(@RequestBody CarEntity car){
        CarEntity carUpdated = carService.updateCar(car);
        return ResponseEntity.ok(carUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCarById(@PathVariable Long id) throws Exception {
        var isDeleted = carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deletePatent/{patent}")
    public ResponseEntity<Boolean> deleteCarByPatent(@PathVariable String patent) throws Exception {
        var isDeleted = carService.deleteCarByPatent(patent);
        return ResponseEntity.noContent().build();
    }
}
