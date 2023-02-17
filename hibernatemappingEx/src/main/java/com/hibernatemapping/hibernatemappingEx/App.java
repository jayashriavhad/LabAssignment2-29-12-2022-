package com.hibernatemapping.hibernatemappingEx;


//import java.sql.DriverManager;
import java.sql.SQLException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	//create Configuration object
    	Configuration cfg=new Configuration();
    	//Configuration the(hibernate.cfg.xml) file
    	cfg.configure("hibernate.cfg.xml");
        //build the Session Factory
        SessionFactory factory=cfg.buildSessionFactory();
       
        
        //create the Employee class object
        Student s=new Student();
        s.setSid(101);
        s.setSname("jayashri");
        
        //create laptop class object
        Laptop l=new Laptop();
        l.setId(201);
        l.setComp_name("Lenovo");// setting the Laptop company name for student object 
        s.setLaptop(l);
        l.setStudent(s);
        
        //open the session by using factory 
        Session session=factory.openSession();
        
        //begin the transaction
        
        Transaction tx=session.beginTransaction();
        //saving the entity object in session
        session.save(s);
        session.save(l);
        //commiting the transaction
        tx.commit();
        //closing the session and factory transaction
        session.close();
        factory.close();
    }
}
