package com.example.abdmalekabassisse.Controllers;

import com.example.abdmalekabassisse.Entity.Stock;
import com.example.abdmalekabassisse.Service.ServiceStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stocks")
public class StockController {
    @Autowired
    ServiceStock serviceStock;

    @GetMapping("/all")
    public List<Stock> retrieveAllStocks(){
        return serviceStock.retrieveAllStocks();
    }

    @GetMapping("{id}")
    public Stock retrieveStock(@PathVariable("id")Long id){
        return serviceStock.retrieveStock(id);
    }

    @PostMapping
    public Stock addStock(@RequestBody Stock s){
        return serviceStock.addStock(s);
    }

    @PutMapping
    public Stock updateStock(@RequestBody Stock s){
        return serviceStock.updateStock(s);
    }

    @DeleteMapping("{id}")
    public void removeStock(@PathVariable("id")Long id){
        serviceStock.removeStock(id);
    }



}
