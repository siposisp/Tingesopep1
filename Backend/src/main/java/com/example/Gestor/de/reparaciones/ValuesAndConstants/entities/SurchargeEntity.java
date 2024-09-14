package com.example.Gestor.de.reparaciones.ValuesAndConstants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "surcharges")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurchargeEntity {
    //De momento, en esta entidad están
    //el recargo por kilometraje y por años de antigüedad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String surchargeType;//Tipo de recargo, "kilometraje" y "antiguedad"

    //Intervalo para kilometraje (en kilometros) y para antigüedad (en años)
    private int min;
    private int max;

    private String carType;//Sedan, Hatchback, SUV, Pickup o Furgoneta
    private double percentage;//Porcentaje de recargo
}

