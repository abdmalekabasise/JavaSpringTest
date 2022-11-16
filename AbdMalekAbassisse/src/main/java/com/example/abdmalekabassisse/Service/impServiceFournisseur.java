package com.example.abdmalekabassisse.Service;

import com.example.abdmalekabassisse.Entity.Fournisseur;
import com.example.abdmalekabassisse.Entity.SecteurActivite;
import com.example.abdmalekabassisse.Repositoy.FournisseurRepository;
import com.example.abdmalekabassisse.Repositoy.SeccteurActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class impServiceFournisseur implements ServiceFournisseur{
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    SeccteurActiviteRepository seccteurActiviteRepository;
    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur f = fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite sa = seccteurActiviteRepository.findById(secteurActiviteId).orElse(null);

        if(f!=null && sa!=null){
            sa.getFournisseurs().add(f);
            seccteurActiviteRepository.save(sa);
        }
    }
}
