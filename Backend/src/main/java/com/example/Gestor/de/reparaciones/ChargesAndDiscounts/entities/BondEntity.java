package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bonuses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BondEntity {
    //Bond es descuento por bonos, no lo incorporé en la
    //entidad Discount debido a la practicidad que hay al tener
    //esta clase, además, esta clase tiene una tabla intermedia
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;//Marca de automovil
    private int quantity;//Cantidad de bonos
    private int amount;//Monto del bono

}
