package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities;

import jakarta.persistence.*;

@MappedSuperclass
public class BasePercentageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    //Intervalo que se usa para nro. de reparaciones y para
    //kilometraje (en kilometros) y para antigüedad (en años)
    private int min;
    private int max;

    //Se usa para día de la semana, porcentaje
    //de descuento y de recargo
    private double percentage;

    //Aplica para:
    //Tipo de recargo, "kilometraje" y "antiguedad"
    //Tipo de descuento, día de la semana ("day")
    // y cantidad de reparaciones ("quantity")
    private String type;
}
