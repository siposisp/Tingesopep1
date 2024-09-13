package com.example.Gestor.de.reparaciones.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bondData")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BondDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marcaAutomovil;//Marca de automovil
    private int cantidadBonos;//Cantidad de bonos
    private int montoBono;//Monto del bono

}
