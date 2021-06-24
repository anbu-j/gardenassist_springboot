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

public class FlowerGarden {
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
private String fertilization_need1;
	//@Column
	@NotNull
private String fertilization_duration1;
	@Column
private String fertilization_need2;
	@Column
private String fertilization_duration2;
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
public String getFertilization_need1() {
	return fertilization_need1;
}
public void setFertilization_need1(String fertilization_need1) {
	this.fertilization_need1 = fertilization_need1;
}
public String getFertilization_duration1() {
	return fertilization_duration1;
}
public void setFertilization_duration1(String fertilization_duration1) {
	this.fertilization_duration1 = fertilization_duration1;
}
public String getFertilization_need2() {
	return fertilization_need2;
}
public void setFertilization_need2(String fertilization_need2) {
	this.fertilization_need2 = fertilization_need2;
}
public String getFertilization_duration2() {
	return fertilization_duration2;
}
public void setFertilization_duration2(String fertilization_duration2) {
	this.fertilization_duration2 = fertilization_duration2;
}


}
