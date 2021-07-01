package com.example.gardenassit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.gardenassit.model.FruitGarden;
import com.example.gardenassit.repository.FruitGardenRepository;

@Service

public class FruitGardenService {
	@Autowired
	FruitGardenRepository fruitsrepo;
	// get all fruits
	public Iterable<FruitGarden> getfruits(){
		return fruitsrepo.findAll();
	}		
//get fruits by id
	public FruitGarden getfruitsbyid(String Plant_id) {
		return fruitsrepo.findById(Plant_id).get();
	}
	// post
	public FruitGarden createfruit(FruitGarden fruit) {
		return fruitsrepo.save(fruit);
	}
	//update fruits
	public FruitGarden updatefruit(FruitGarden fruit) {
		return fruitsrepo.save(fruit);
	}
	//delete fruits
	public HttpStatus deletefruit(String Plant_id) {
		fruitsrepo.deleteById(Plant_id);
		return HttpStatus.OK;
	}
	
}