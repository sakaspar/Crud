package com.viraj.sample.service;

import com.viraj.sample.entity.Bag;
import com.viraj.sample.repository.BagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BagServiceImpl implements BagService {

    @Autowired
    BagRepository bagRepository;
    BagService BagService ; 

    @Override
    public Bag saveBag(Bag bag) {
        return bagRepository.save(bag);
    }

    @Override
    public Bag getBag(Long bagID) {
        return bagRepository.findById(bagID).get();
    }



    @Override
    public List<Bag> getAllBags() {
        return (List<Bag>) bagRepository.findAll();
    }

    

    @Override
    public void deleteBag(Long bagId) {
        bagRepository.deleteById(bagId);
    }

    @Override
    public Bag updateBag(Bag bag) {
        return bagRepository.save(bag);
       
    }

    
   
}
