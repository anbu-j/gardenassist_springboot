package com.example.gardenassit.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
//import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name="flower_garden")

public class FruitGarden {
	@Id
	@Column
	private String plant_id;
	//@Column
	@NotNull
private String name;
	//@Column
	@NotNull
private String plant_type;
	//@Column
	@NotNull
private String seasonality;
	//@Column
	@NotNull
private String watering_duration;
	//@Column
	@NotNull
private Date planting_date;
	@Column
private Date end_date;
	//@Column
	@NotNull
private String fertilization_need;
	//@Column
	@NotNull
private String fertilization_duration;
	@Column
private Date harvesting_date;
	@Column
private String harvesting_duration;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlant_id() {
	return plant_id;
}
public void setPlant_id(String plant_id) {
	this.plant_id = plant_id;
}
public String getPlant_type() {
	return plant_type;
}
public void setPlant_type(String plant_type) {
	this.plant_type = plant_type;
}
public String getSeasonality() {
	return seasonality;
}
public void setSeasonality(String seasonality) {
	this.seasonality = seasonality;
}
public String getWatering_duration() {
	return watering_duration;
}
public void setWatering_duration(String watering_duration) {
	this.watering_duration = watering_duration;
}
public Date getPlanting_date() {
	return planting_date;
}
public void setPlanting_date(Date planting_date) {
	this.planting_date = planting_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}
public String getFertilization_need() {
	return fertilization_need;
}
public void setFertilization_need(String fertilization_need) {
	this.fertilization_need = fertilization_need;
}
public String getFertilization_duration() {
	return fertilization_duration;
}
public void setFertilization_duration(String fertilization_duration) {
	this.fertilization_duration = fertilization_duration;
}
public Date getHarvesting_date() {
	return harvesting_date;
}
public void setHarvesting_date(Date harvesting_date) {
	this.harvesting_date = harvesting_date;
}
public String getHarvesting_duration() {
	return harvesting_duration;
}
public void setHarvesting_duration(String harvesting_duration) {
	this.harvesting_duration = harvesting_duration;
}


}
