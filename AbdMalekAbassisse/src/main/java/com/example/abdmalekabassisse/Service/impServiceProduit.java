package com.example.abdmalekabassisse.Service;

import com.example.abdmalekabassisse.Entity.Produit;
import com.example.abdmalekabassisse.Entity.Stock;
import com.example.abdmalekabassisse.Repositoy.ProduitRepository;
import com.example.abdmalekabassisse.Repositoy.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class impServiceProduit implements ServiceProduit{
    @Autowired
    StockRepository stockRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock s = stockRepository.findById(idStock).orElse(null);
        Produit p = produitRepository.findById(idProduit).orElse(null);
        if(s!=null && p!=null){
            p.setStock(s);
            produitRepository.save(p);
        }
    }
}
