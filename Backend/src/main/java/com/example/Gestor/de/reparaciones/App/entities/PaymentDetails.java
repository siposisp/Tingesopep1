package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;

@Data
@Embeddable
public class PaymentDetails {

    private double totalAmountRepairs;//Monto total de la reparaciones (es la suma de todas las reparaciones)
    private double amountWithoutIva;//SUB Total (monto sin iva)
    private double total;//Monto total a pagar
    private double surchages;//Recargos
    private double discounts;//descuentos
    private double iva;//iva del monto
}
