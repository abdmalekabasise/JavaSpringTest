package com.example.abdmalekabassisse.Repositoy;

import com.example.abdmalekabassisse.Entity.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeccteurActiviteRepository extends JpaRepository<SecteurActivite,Long> {
}
