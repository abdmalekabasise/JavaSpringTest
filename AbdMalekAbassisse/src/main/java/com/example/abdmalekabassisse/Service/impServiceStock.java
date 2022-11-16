package com.example.abdmalekabassisse.Service;

import com.example.abdmalekabassisse.Entity.Stock;
import com.example.abdmalekabassisse.Repositoy.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class impServiceStock implements ServiceStock{
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        Stock s = stockRepository.findById(id).orElse(null);
        if(s!=null){
            stockRepository.delete(s);
        }
    }
}
