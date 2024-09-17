package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.services;

import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories.SurchargesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SurchagesService {
    @Autowired
    private SurchargesRepository surchargesRepository;

/*
    public double getPorcentajeRecargoRetraso(HistorialEntity historialReparaciones){
        LocalDate fechasSalida = historialReparaciones.getFechaSalidaTaller();
        LocalDate fechaRetirada = historialReparaciones.getFechaClienteSeLlevaVehiculo();

        //Calcular diferencia entre fechas
        long diferenciaEnDias = ChronoUnit.DAYS.between(fechasSalida, fechaRetirada);

        //Si hay retraso, calcular el recargo
        double recargo = 0;
        if (diferenciaEnDias > 0) {
            recargo = 0.05 * diferenciaEnDias; // 5% del monto total por cada día de retraso
        }
        return recargo;
    }

 */



}
