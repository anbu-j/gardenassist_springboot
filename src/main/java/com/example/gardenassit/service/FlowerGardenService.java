package com.example.gardenassit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.gardenassit.model.FlowerGarden;
import com.example.gardenassit.repository.FlowerGardenRepository;

@Service

public class FlowerGardenService {
	@Autowired
	FlowerGardenRepository flowersrepo;
	// get all flowers
	public Iterable<FlowerGarden> getflowers(){
		return flowersrepo.findAll();
	}		
//get flowers by id
	public FlowerGarden getflowersbyid(String Plant_id) {
		return flowersrepo.findById(Plant_id).get();
	}
	// post
	public FlowerGarden createflower(FlowerGarden flower) {
		return flowersrepo.save(flower);
	}
	//update flowers
	public FlowerGarden updateflower(FlowerGarden flower) {
		return flowersrepo.save(flower);
	}
	//delete flowers
	public HttpStatus deleteflower(String Plant_id) {
		flowersrepo.deleteById(Plant_id);
		return HttpStatus.OK;
	}
	
}
