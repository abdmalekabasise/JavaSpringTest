package com.example.abdmalekabassisse.Service;

import com.example.abdmalekabassisse.Entity.Stock;

import java.util.List;

public interface ServiceStock {
    public List<Stock> retrieveAllStocks();
    public Stock addStock(Stock s);
    public Stock updateStock(Stock s);
    public Stock retrieveStock(Long id);
    public void removeStock(Long id);
}
