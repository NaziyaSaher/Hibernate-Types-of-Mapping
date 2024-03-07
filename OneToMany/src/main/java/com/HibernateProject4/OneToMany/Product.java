package com.HibernateProject4.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	int p_id;
	String p_name;
	int p_cost;
	
	@ManyToOne
	Customer cust;
	
	public Product() {
	}

	public Product(int p_id, String p_name, int p_cost, Customer cust) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cost = p_cost;
		this.cust = cust;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_cost() {
		return p_cost;
	}

	public void setP_cost(int p_cost) {
		this.p_cost = p_cost;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
}
