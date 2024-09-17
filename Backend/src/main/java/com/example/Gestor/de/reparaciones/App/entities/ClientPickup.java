package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
public class ClientPickup {
    private LocalDate pickupDate;
    private LocalTime pickupHour;
}