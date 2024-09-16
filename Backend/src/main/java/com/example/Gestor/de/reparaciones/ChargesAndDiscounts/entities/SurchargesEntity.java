package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "surcharges")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurchargesEntity extends BasePercentageEntity{
    private String carType;//Sedan, Hatchback, SUV, Pickup o Furgoneta
}

