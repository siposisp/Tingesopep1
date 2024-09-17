package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "repairs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepairsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private int repairNumber; //Número de reparación Ej: 1,2,3,...,11
    private String repairTitle;//Ej: Reparación de Neumáticos y Ruedas
    private LocalDate repairDate; //Fecha de la reparación
    private LocalTime repairHour; //Hora de la reparación
    private double amount; //Monto de la reparación

    //Foranea
    private Long idRepairHistory;
    private String patent;
}
