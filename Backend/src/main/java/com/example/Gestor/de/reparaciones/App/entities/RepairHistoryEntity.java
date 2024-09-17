package com.example.Gestor.de.reparaciones.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "repairHistory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepairHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private boolean state; //Pagado o no pagado

    @Embedded
    private PaymentDetails paymentDetails;
    @Embedded
    private WorkshopEntryExit entryExit;
    @Embedded
    private ClientPickup clientPickup;

    //Foranea de car
    private String patent;
}
