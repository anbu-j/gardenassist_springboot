package com.example.gardenassit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gardenassit.model.FlowerGarden;
@Repository
public interface FlowerGardenRepository extends CrudRepository<FlowerGarden,String> {

}
