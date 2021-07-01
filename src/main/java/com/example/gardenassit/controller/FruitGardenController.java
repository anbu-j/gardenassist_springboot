package com.example.gardenassit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gardenassit.model.FruitGarden;
import com.example.gardenassit.repository.FruitGardenRepository;
import com.example.gardenassit.service.FruitGardenService;
// to interact with flower repository by creating a Rest API
@CrossOrigin
@RestController
//to set an api layer
@RequestMapping("/FruitGarden")
public class FruitGardenController {
	@Autowired 
	FruitGardenService fruitservice;
	@Autowired
	FruitGardenRepository fruitsrepo;
	//get all fruits
	@GetMapping
	public Iterable<FruitGarden>getfruits(){
		return fruitservice.getfruits();
	}
	
	@GetMapping("/{Plant_id}")
    public FruitGarden getfruitsbyid(@PathVariable String Plant_id) {
        return fruitsrepo.findById(Plant_id).orElseThrow(RuntimeException::new);
    }
	//create fruits
	@PostMapping
	public FruitGarden createfruit(@RequestBody FruitGarden fruit) {
		return fruitservice.createfruit(fruit);
		}
	@PutMapping("/{Plant_id}")
    public ResponseEntity<FruitGarden> updatefruit(@PathVariable String Plant_id, @RequestBody FruitGarden fruit) {
		FruitGarden currentFruit = fruitsrepo.findById(Plant_id).orElseThrow(RuntimeException::new);
		currentFruit.setPlant_id(fruit.getPlant_id());
        currentFruit.setName(fruit.getName());
        currentFruit.setPlant_type(fruit.getPlant_type());
        currentFruit.setSeasonality(fruit.getSeasonality());
        currentFruit.setWatering_duration(fruit.getWatering_duration());
        currentFruit.setPlanting_date(fruit.getPlanting_date());
        currentFruit.setEnd_date(fruit.getEnd_date());
        currentFruit.setFertilization_need(fruit.getFertilization_need());
        currentFruit.setFertilization_duration(fruit.getFertilization_duration());
        currentFruit.setHarvesting_date(fruit.getHarvesting_date());
        currentFruit.setHarvesting_duration(fruit.getHarvesting_duration());
        currentFruit = fruitsrepo.save(fruit);

        return ResponseEntity.ok(currentFruit);
    }
	@DeleteMapping("/{Plant_id}")
    public ResponseEntity<FruitGarden> deleteflower(@PathVariable String Plant_id) {
        //fruitsrepo.deleteById(Plant_id);
		fruitservice.deletefruit(Plant_id);
        return ResponseEntity.ok().build();
        //return ReponseEntity.HttpStatus.OK;
    }
}
	

