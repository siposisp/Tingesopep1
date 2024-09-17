package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "priceRepairs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceRepairsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String repairTitle;//Ej: reparacion sistema electrico
    private int repairNumber;//reparacion tipo 1, 2, ... , 11
    private String description;
    private int amount;
    private String engine; //Tipo de motor
}
