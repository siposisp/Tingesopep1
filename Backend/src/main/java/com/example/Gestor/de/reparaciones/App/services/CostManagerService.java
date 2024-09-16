package com.example.Gestor.de.reparaciones.App.services;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.services.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostManagerService {
    @Autowired
    private BondService bondService;



}