package com.HibernateProject5.ManyToMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	creating the list for storing employess
    	List<Employee> Lemp1=new ArrayList<Employee>();
    	List<Employee> Lemp2=new ArrayList<Employee>();
    	List<Employee> Lemp3=new ArrayList<Employee>();
    	List<Employee> Lemp4=new ArrayList<Employee>();
    	List<Employee> Lemp5=new ArrayList<Employee>();
    	
//    	creating emp obejct
    	Employee emp1=new Employee();
    	Employee emp2=new Employee();
    	Employee emp3=new Employee();
    	Employee emp4=new Employee();
    	Employee emp5=new Employee();
    	
//    	adding the employee object to empL1
    	Lemp1.add(emp4);
    	Lemp1.add(emp3);
    	Lemp1.add(emp1);
    	Lemp1.add(emp2);
    	
//    	adding the employee object to empL2
    	Lemp2.add(emp3);
    	Lemp2.add(emp2);
    	Lemp2.add(emp4);
    	
//    	adding the employee object to empL3
    	Lemp3.add(emp1);
    	Lemp3.add(emp3);
    	
//    	adding the employee object to empL4
    	Lemp4.add(emp3);
    	Lemp4.add(emp5);
    	Lemp4.add(emp4);
    	Lemp4.add(emp2);
    	Lemp4.add(emp1);
    	
//    	adding the employee object to empL5
    	Lemp5.add(emp1);
    	Lemp5.add(emp2);
    	Lemp5.add(emp4);
    	
//    	creating the list for storing technology
    	List<Technology> Ltech1=new ArrayList<Technology>();
    	List<Technology> Ltech2=new ArrayList<Technology>();
    	List<Technology> Ltech3=new ArrayList<Technology>();
    	
//    	craeting technology object
    	Technology tech1=new Technology();
    	Technology tech2=new Technology();
    	Technology tech3=new Technology();
    	
//    	adding the technology obj to tech1
    	Ltech1.add(tech3);
    	Ltech1.add(tech1);
    	Ltech1.add(tech2);
    	
//    	adding the technology obj to tech2
    	Ltech2.add(tech1);
    	Ltech2.add(tech2);
    	Ltech2.add(tech3);
    	
//    	adding the technology obj to tech3
    	Ltech3.add(tech2);
    	Ltech3.add(tech1);
    	Ltech3.add(tech3);
    	
//    	setting values for emp1 
    	emp1.setE_id(111);
    	emp1.setE_name("Arun");
    	emp1.setTeam("Team-A");
    	emp1.setTech(Ltech3);
    	
//    	setting values for emp2
    	emp2.setE_id(112);
    	emp2.setE_name("Arjun");
    	emp2.setTeam("Team-B");
    	emp2.setTech(Ltech2);
    	
//    	setting values for emp3
    	emp3.setE_id(113);
    	emp3.setE_name("Rahul");
    	emp3.setTeam("Team-C");
    	emp3.setTech(Ltech3);
    	
//    	setting values for emp4
    	emp4.setE_id(114);
    	emp4.setE_name("Shamir");
    	emp4.setTeam("Team-D");
    	emp4.setTech(Ltech2);
    	
//    	setting values for emp5
    	emp5.setE_id(115);
    	emp5.setE_name("Ankit");
    	emp5.setTeam("Team-E");
    	emp5.setTech(Ltech1);
    	
//    	setting values for tech1 
    	tech1.setT_id(101);
    	tech1.setT_name("Java");
    	tech1.setEmp(Lemp5);
    	
//    	setting values for tech2
    	tech2.setT_id(102);
    	tech2.setT_name("SQL");
    	tech2.setEmp(Lemp4);
    	
//    	setting values for tech3
    	tech3.setT_id(103);
    	tech3.setT_name("JDBC");
    	tech3.setEmp(Lemp2);
    	
    	
    	Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction trans=session.beginTransaction();
        
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(emp4);
        session.save(emp5);
        
        session.save(tech1);
        session.save(tech2);
        session.save(tech3);
        
        trans.commit();
        System.out.println("Succesfull");
    }
}
