package com.example.Gestor.de.reparaciones.App.controller;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities.BondEntity;
import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.services.BondService;
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
    public ResponseEntity<BondEntity> getBondById(@PathVariable Long id) {
        BondEntity bono = bondService.getBondById(id);
        return ResponseEntity.ok(bono);
    }

    @PostMapping("/")
    public ResponseEntity<BondEntity> saveBono(@RequestBody BondEntity bono) {
        BondEntity bonoNew = bondService.saveBond(bono);
        return ResponseEntity.ok(bonoNew);
    }

    @PutMapping("/")
    public ResponseEntity<BondEntity> updateBono(@RequestBody BondEntity bono){
        BondEntity bonoUpdated = bondService.updateBond(bono);
        return ResponseEntity.ok(bonoUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBonoById(@PathVariable Long id) throws Exception {
        var isDeleted = bondService.deleteBond(id);
        return ResponseEntity.noContent().build();
    }
}
