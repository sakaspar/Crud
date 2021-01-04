package com.viraj.sample.repository;

import com.viraj.sample.entity.Bag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BagRepository extends   CrudRepository <Bag,Long>{
}
