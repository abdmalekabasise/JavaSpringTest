package com.example.abdmalekabassisse.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    private Date dateCreationFacture;
    private Date dateDerniereModification;
    private boolean archivee;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;
    @OneToMany(mappedBy = "facture")
    private List<Reglement> reglements;
    @ManyToOne
    private Fournisseur fournisseur;
}
