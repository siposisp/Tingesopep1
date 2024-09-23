package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Embeddable
public class WorkshopEntryExit {

    private LocalDate entryDate;//Fecha de ingreso al taller
    private LocalTime entryHour;//Hora de ingreso al taller
    private LocalDate exitDate; //Fecha de salida del taller
    private LocalTime exitHour; //Hora de salida del taller

}
