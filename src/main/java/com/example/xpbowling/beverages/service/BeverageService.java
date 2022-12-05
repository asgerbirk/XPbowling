package com.example.xpbowling.beverages.service;

import com.example.xpbowling.beverages.model.Beverages;
import com.example.xpbowling.beverages.repository.BeverageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {

    private final BeverageRepository beverageRepository;

    public BeverageService(BeverageRepository beverageRepository) {
        this.beverageRepository = beverageRepository;
    }

    public List<Beverages> getAllBeverages(){
        return beverageRepository.findAll();
    }

    public Beverages findById(Long id){
        return beverageRepository.findById(id).orElseThrow(() -> new IllegalStateException("no beverages with that id" + id));
    }

    public void deleteBeverage(Long id){
        boolean checkIfBeverageExists = beverageRepository.existsById(id);
        if(!checkIfBeverageExists){
            throw new IllegalStateException("does not exist" + id);
        }
        beverageRepository.deleteById(id);
    }

    public Beverages updateBeverages(Long id, Beverages beverages){
        return beverageRepository.save(beverages);
    }
}
