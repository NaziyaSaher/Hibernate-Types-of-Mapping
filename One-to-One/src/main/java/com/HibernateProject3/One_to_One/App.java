package com.HibernateProject3.One_to_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//    	-->Bi-direction: OneToOne 
    	Bike2 bk1=new Bike2();
    	Bike2 bk2=new Bike2();
    	Bike2 bk3=new Bike2();
    	
    	Student2 st1= new Student2(200, "Anikate",55,bk1);
    	Student2 st2= new Student2(300, "Anikate",50,bk2);
    	Student2 st3= new Student2(400, "Anikate",40,bk3);
    	
    	bk1.setBikeId(1000);
    	bk1.setBrand("Hero");
        bk1.setColor("red");
        bk1.setSt(st1);
       
        bk2.setBikeId(2000);
    	bk2.setBrand("Ero");
        bk2.setColor("blue");
        bk2.setSt(st2);
        
        bk3.setBikeId(3000);
    	bk3.setBrand("Hunda");
        bk3.setColor("black");
        bk3.setSt(st3);
    	
       Configuration cfg=new Configuration().configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Transaction trans=session.beginTransaction();
       
       session.save(st1);
       session.save(st2);
       session.save(st3);
       session.save(st3);
       session.save(bk1);
       session.save(bk2);
       session.save(bk3);
       
       trans.commit();
       System.out.println("Successfull");
       
    }
}
