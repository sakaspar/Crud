package com.viraj.sample.service;

import com.viraj.sample.entity.Bag;

//import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BagService {

    Bag saveBag(Bag bag);
    List<Bag> getAllBags();
    Bag getBag(Long bagId);
    void deleteBag(Long bagId);
    Bag updateBag( Bag bag);
}
