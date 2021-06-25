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

import com.example.gardenassit.model.FlowerGarden;
import com.example.gardenassit.repository.FlowerGardenRepository;
import com.example.gardenassit.service.FlowerGardenService;

@CrossOrigin
@RestController
//to set an api layer
@RequestMapping("/FlowerGarden")
public class FlowerGardenController {
	@Autowired 
	FlowerGardenService flowerservice;
	@Autowired
	FlowerGardenRepository flowersrepo;
	//get all flowers
	@GetMapping
	public Iterable<FlowerGarden>getflowers(){
		return flowerservice.getflowers();
	}
	
	@GetMapping("/{Plant_id}")
    public FlowerGarden getflowersbyid(@PathVariable String Plant_id) {
        return flowersrepo.findById(Plant_id).orElseThrow(RuntimeException::new);
    }
	//create flowers
	@PostMapping
	public FlowerGarden createflower(@RequestBody FlowerGarden flower) {
		return flowerservice.createflower(flower);
		}
	@PutMapping("/{Plant_id}")
    public ResponseEntity<FlowerGarden> updateflower(@PathVariable String Plant_id, @RequestBody FlowerGarden flower) {
		FlowerGarden currentFlower = flowersrepo.findById(Plant_id).orElseThrow(RuntimeException::new);
		currentFlower.setPlant_id(flower.getPlant_id());
        currentFlower.setName(flower.getName());
        currentFlower.setPlant_type(flower.getPlant_type());
        currentFlower.setSeasonality(flower.getSeasonality());
        currentFlower.setWatering_duration(flower.getWatering_duration());
        currentFlower.setPlanting_date(flower.getPlanting_date());
        currentFlower.setEnd_date(flower.getEnd_date());
        currentFlower.setFertilization_need1(flower.getFertilization_need1());
        currentFlower.setFertilization_duration1(flower.getFertilization_duration1());
        currentFlower.setFertilization_need2(flower.getFertilization_need2());
        currentFlower.setFertilization_duration2(flower.getFertilization_duration2());
        currentFlower = flowersrepo.save(flower);

        return ResponseEntity.ok(currentFlower);
    }
	@DeleteMapping("/{Plant_id}")
    public ResponseEntity<FlowerGarden> deleteflower(@PathVariable String Plant_id) {
        //flowersrepo.deleteById(Plant_id);
		flowerservice.deleteflower(Plant_id);
        return ResponseEntity.ok().build();
        //return ReponseEntity.HttpStatus.OK;
    }
}
	

