package com.HibernateProject3.One_to_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Bike2 {
	
	@Id
	int bikeId;
	String brand;
	String color;
	
	@OneToOne
	Student2 st;
	
	
	public Bike2() {
	}


	public Bike2(int bikeId, String brand, String color, Student2 st) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
		this.st = st;
	}


	public int getBikeId() {
		return bikeId;
	}


	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Student2 getSt() {
		return st;
	}


	public void setSt(Student2 st) {
		this.st = st;
	}
}