package com.example.Gestor.de.reparaciones.ChargesAndDiscounts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "discounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountsEntity extends BasePercentageEntity{
    //De momento, en esta entidad solo está
    //el descuento por cantidad de reparaciones
    private String engine;//Motor. gasolina, diésel, híbrido o eléctrico
}

