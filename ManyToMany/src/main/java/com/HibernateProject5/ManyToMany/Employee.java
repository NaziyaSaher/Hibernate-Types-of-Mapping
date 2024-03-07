package com.HibernateProject5.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee {
	
	@Id
	int e_id;
	String e_name;
	String team;
	
	@ManyToMany
	List<Technology> tech;
	
	public Employee() {
	}

	public Employee(int e_id, String e_name, String team, List<Technology> tech) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.team = team;
		this.tech = tech;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<Technology> getTech() {
		return tech;
	}

	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
}
