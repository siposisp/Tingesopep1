package com.example.Gestor.de.reparaciones.App.controller;

import com.example.Gestor.de.reparaciones.ValuesAndConstants.entities.BondEntity;
import com.example.Gestor.de.reparaciones.ValuesAndConstants.services.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/datosbonos")
@CrossOrigin("*")
public class BondController {

    @Autowired
    BondService bondService;

    @GetMapping("/")
    public ResponseEntity<List<BondEntity>> listBonos() {
        List<BondEntity> bonos = bondService.getBonuses();
        return ResponseEntity.ok(bonos);

    }

    @GetMapping("/{id}")
    public ResponseEntity<BondEntity> getBonoById(@PathVariable Long id) {
        BondEntity bono = bondService.getBoundById(id);
        return ResponseEntity.ok(bono);
    }

    @PostMapping("/")
    public ResponseEntity<BondEntity> saveBono(@RequestBody BondEntity bono) {
        BondEntity bonoNew = bondService.saveBound(bono);
        return ResponseEntity.ok(bonoNew);
    }

    @PutMapping("/")
    public ResponseEntity<BondEntity> updateBono(@RequestBody BondEntity bono){
        BondEntity bonoUpdated = bondService.updateBound(bono);
        return ResponseEntity.ok(bonoUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBonoById(@PathVariable Long id) throws Exception {
        var isDeleted = bondService.deleteBound(id);
        return ResponseEntity.noContent().build();
    }
}
