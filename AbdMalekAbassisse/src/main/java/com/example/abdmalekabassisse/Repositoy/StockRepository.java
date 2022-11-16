package com.example.abdmalekabassisse.Repositoy;

import com.example.abdmalekabassisse.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long>{

}
