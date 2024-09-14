package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String patent;//4 letras y 2 números
    private String brand;//Marca como Toyota, Kia, Honda, Ford, Chevrolet, Hyundai, etc.
    private String model;
    private String type;//Sedan, Hatchback, SUV, Pickup o Furgoneta)
    private int year; //Año de fabricación
    private String engine;//Motor. gasolina, diésel, híbrido o eléctrico
    private int seats;//Cantidad de asientos
    private int mileage;//Kilometraje

}
