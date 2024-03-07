package com.HibernateProject4.OneToMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       
    	Product p1= new Product();
    	Product p2= new Product();
    	Product p3= new Product();
    	Product p4= new Product();
    	
    	List<Product> List1=new ArrayList();
    	List<Product> List2=new ArrayList();
    	
    	List1.add(p1);
    	List1.add(p2);
    	
    	List2.add(p3);
    	List2.add(p4);
    	
    	Customer c1=new Customer(1001, "Naaz", 23, List1);
    	Customer c2=new Customer(1002, "Shazaib", 24, List2);
    	
    	p1.setP_id(1111);
    	p1.setP_name("laptop");
    	p1.setP_cost(140000);
    	p1.setCust(c1);
    	
    	p2.setP_id(2222);
    	p2.setP_name("Mehndi");
    	p2.setP_cost(150000);
    	p2.setCust(c1);
    	
    	p3.setP_id(3333);
    	p3.setP_name("Max");
    	p3.setP_cost(160000);
    	p3.setCust(c2);
    	
    	p4.setP_id(4444);
    	p4.setP_name("Lipstick");
    	p4.setP_cost(170000);
    	p4.setCust(c2);
    	
    	Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction trans=session.beginTransaction();
        
        session.save(c1);
        session.save(c2);
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        
        trans.commit();
        System.out.println("Succesfull");
    }
}
