package com.example.Gestor.de.reparaciones.ValuesAndConstants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "discounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountEntity {
    //De momento, en esta entidad solo está
    //el descuento por cantidad de reparaciones
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    //Intervalo de nro. de reparaciones
    private int min;
    private int max;

    private String engine;//Motor. gasolina, diésel, híbrido o eléctrico
    private double percentage;//Porcentaje de descuento
}

