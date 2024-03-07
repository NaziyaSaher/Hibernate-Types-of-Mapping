package com.HibernateProject5.ManyToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	
	@Id
	int t_id;
	String t_name;
	
	@ManyToMany
	List<Employee> emp;
	
	public Technology() {
	}

	public Technology(int t_id, String t_name, List<Employee> emp) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.emp = emp;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

}
