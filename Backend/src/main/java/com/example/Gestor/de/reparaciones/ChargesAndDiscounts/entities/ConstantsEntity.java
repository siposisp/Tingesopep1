package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "constants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConstantsEntity {
    //Constantes en porcentajes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String type;//Puede ser iva
    private double percentage;//Monto (en porcentaje, ej. 0.05 para 5%)

}
