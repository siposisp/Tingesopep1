package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bond")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BondEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;//Marca de automovil
    private int quantity;//Cantidad de bonos
    private int amount;//Monto del bono

}
