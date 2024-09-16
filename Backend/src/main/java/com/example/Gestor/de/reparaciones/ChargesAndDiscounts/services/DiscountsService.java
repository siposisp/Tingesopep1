package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.services;

import com.example.Gestor.de.reparaciones.App.entities.CarEntity;
import com.example.Gestor.de.reparaciones.ChargesAndDiscounts.repositories.DiscountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class DiscountsService {
    @Autowired
    private DiscountsRepository discountsRepository;

    // --------------------------CREATE--------------------------

    // ---------------------------READ---------------------------

    //Obtener el porcentaje de descuento en un día
    public double getPercentageDayDiscount(LocalDate fechaEntrada, LocalTime horaEntrada){
        DayOfWeek diaDeLaSemana = fechaEntrada.getDayOfWeek();
        int horaDeEntrada = horaEntrada.getHour();

        //Verificar día de la semana
        if((diaDeLaSemana == DayOfWeek.MONDAY || diaDeLaSemana == DayOfWeek.THURSDAY) && (horaDeEntrada >= 9 && horaDeEntrada < 12)){
            return discountsRepository.getAmountByDayType("day");
        }
        else{
            return 0;
        }
    }

    //Me falta ver lo de los días
    public double getAmountByEngineType(CarEntity car){
        //OOOOOOOOOOOOOOJOOOOOOOOOOOOOOOOO FALTA CALCULAR LA CANTIDAD DE VISITAS AL TALLER
        return discountsRepository.getAmountByEngineType(car.getEngine(), 5);
    }

    // --------------------------UPDATE--------------------------

    // --------------------------DELETE--------------------------











}
