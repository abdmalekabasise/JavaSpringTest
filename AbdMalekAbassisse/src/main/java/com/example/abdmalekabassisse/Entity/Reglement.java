package com.example.abdmalekabassisse.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReglement;
    private float montantPaye;
    private float montantRestant;
    private boolean payee;
    private Date dateReglement;
    @ManyToOne
    private Facture facture;
}
