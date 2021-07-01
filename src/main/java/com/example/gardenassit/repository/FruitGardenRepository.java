package com.example.gardenassit.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gardenassit.model.FruitGarden;
@Repository
public interface FruitGardenRepository extends CrudRepository<FruitGarden,String>{

}
