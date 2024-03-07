package com.HibernateProject3.One_to_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Student2 {

	    @Id
		int rollNo;
		String name;
		int age;
		
		@OneToOne
		Bike2 bike;//class_name any_ref_veriable
		
//		Zero-parameterized constructor
		public Student2() {
		}

public Student2(int rollNo, String name, int age, Bike2 bike) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
	this.bike = bike;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Bike2 getBike() {
	return bike;
}

public void setBike(Bike2 bike) {
	this.bike = bike;
}
		
}
