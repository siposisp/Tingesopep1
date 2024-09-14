package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "carBond")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarBondEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private LocalDate dateCarBond;//Fecha en la que se aplica el bono
    //private LocalTime timeCarBond;//Hora en la que se aplica el bono

    //Llaves foráneas
    private String patent;//Foránea de Car
    private Long idBond;//Foránea de Bond

}
