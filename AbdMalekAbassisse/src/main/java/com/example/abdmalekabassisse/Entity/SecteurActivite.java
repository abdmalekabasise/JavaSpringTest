package com.example.abdmalekabassisse.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecteurActivite;
    private  String codeSecteurActivite;
    private String libelleSecteurActivite;
    @ManyToMany
    private List<Fournisseur> fournisseurs = new ArrayList<>();
}
