package com.example.Gestor.de.reparaciones.controller;

import com.example.Gestor.de.reparaciones.entities.BondDataEntity;
import com.example.Gestor.de.reparaciones.services.BondDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/datosbonos")
@CrossOrigin("*")
public class BondDataController {

    @Autowired
    BondDataService bondDataService;

    @GetMapping("/")
    public ResponseEntity<List<BondDataEntity>> listBonos() {
        List<BondDataEntity> bonos = bondDataService.getDatosBonos();
        return ResponseEntity.ok(bonos);

    }

    @GetMapping("/{id}")
    public ResponseEntity<BondDataEntity> getBonoById(@PathVariable Long id) {
        BondDataEntity bono = bondDataService.getDatosBonosById(id);
        return ResponseEntity.ok(bono);
    }

    @PostMapping("/")
    public ResponseEntity<BondDataEntity> saveBono(@RequestBody BondDataEntity bono) {
        BondDataEntity bonoNew = bondDataService.saveDatosBonos(bono);
        return ResponseEntity.ok(bonoNew);
    }

    @PutMapping("/")
    public ResponseEntity<BondDataEntity> updateBono(@RequestBody BondDataEntity bono){
        BondDataEntity bonoUpdated = bondDataService.updateDatosBonos(bono);
        return ResponseEntity.ok(bonoUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBonoById(@PathVariable Long id) throws Exception {
        var isDeleted = bondDataService.deleteDatosBonos(id);
        return ResponseEntity.noContent().build();
    }
}
