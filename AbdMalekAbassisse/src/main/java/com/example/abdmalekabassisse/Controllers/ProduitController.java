package com.example.abdmalekabassisse.Controllers;

import com.example.abdmalekabassisse.Service.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produits")
public class ProduitController {
    @Autowired
    ServiceProduit serviceProduit;
    @PutMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable("idProduit") Long idProduit,@PathVariable("idStock") Long idStock){
        serviceProduit.assignProduitToStock(idProduit,idStock);
    }

}
