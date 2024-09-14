package com.example.Gestor.de.reparaciones.ValuesAndConstants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "constants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Constants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private double iva;

}
