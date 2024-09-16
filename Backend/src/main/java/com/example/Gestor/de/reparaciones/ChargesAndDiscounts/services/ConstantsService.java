package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.services;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories.ConstantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstantsService {
    @Autowired
    private ConstantsRepository constantsRepository;

    public double getAmount(String type) {
        return constantsRepository.getAmountByType(type);
    }
}
