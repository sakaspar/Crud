package com.viraj.sample.service;

import com.viraj.sample.entity.Bag;


import java.util.List;

public interface BagService {

    Bag saveBag(Bag bag);
    Bag updateBag(Bag bag);
    List<Bag> getAllBags();
    Bag getBag(Long bagId);
    void deleteBag(Long bagId);
}
