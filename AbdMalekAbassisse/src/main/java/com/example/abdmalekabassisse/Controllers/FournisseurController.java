package com.example.abdmalekabassisse.Controllers;

import com.example.abdmalekabassisse.Service.ServiceFournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fournisseurs")
public class FournisseurController {
    @Autowired
    ServiceFournisseur serviceFournisseur;

    @PostMapping("/assign/{fournisseurId}/{secteurActiviteId}")
    public void assignSecteurActiviteToFournisseur(@PathVariable("fournisseurId") Long fournisseurId,@PathVariable("secteurActiviteId") Long secteurActiviteId ){
        serviceFournisseur.assignSecteurActiviteToFournisseur(fournisseurId,secteurActiviteId);
    }

}
