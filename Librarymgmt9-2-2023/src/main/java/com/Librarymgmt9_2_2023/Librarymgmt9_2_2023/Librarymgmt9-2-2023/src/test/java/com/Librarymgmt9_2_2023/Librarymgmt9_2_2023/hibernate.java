<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

	<hibernate-configuration>
	     <session-factory>
	        <property name="connection.driver-class">com.mysql.jdbc.Driver</property>
	        <property name="connection.url">jdbc:mysql://localhost:3307/hibernateex</property>
	        <property name="connection.username">root</property>
	        <property name="connection.password">jayshri</property>
	        <property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>
	        <property name="hbm2ddl.auto">create</property>
	        <property name="show_sql">true</property>
	        <mapping class="com.hibernatemapping.hibernatemappingEx.Student"/>
	         <mapping class="com.hibernatemapping.hibernatemappingEx.Cource"/>
	     </session-factory>
	
	</hibernate-configuration>
	
	
	
	package com.hibernatemapping.hibernatemappingEx;

//import java.sql.Connection;
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
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        //is the session factory closed?
      //  System.out.println(factory.isClosed());
        
        //create the Employee class object
        Student s=new Student();
        s.setSid(101);
        s.setSname("jayashri");
        
        Cource c=new Cource();
        c.setCid(201);
        c.setCname("C Programming");// setting the cource for student object 
        s.setCourse(c);
        c.setStudent(s);
        
        Session session=factory.openSession();
        
        //begin the transaction
        
        Transaction tx=session.beginTransaction();
        session.save(s);
        session.save(c);
        tx.commit();
        session.close();
        factory.close();
    }
}



package com.hibernatemapping.hibernatemappingEx;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="Cource_Table")
public class Cource 
{
	@Id @Column(name="Cource_Id")
	private int cid;
	private String cname;
	@OneToOne @JoinColumn(name="Student_id")
	private Student student;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Cource(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
		//this.student = student;
	}
	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	

}


package com.hibernatemapping.hibernatemappingEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
	private int sid;
	
	private String sname;
	@OneToOne @JoinColumn(name="Student_cource_id")
	private Cource course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Cource getCourse() {
		return course;
	}
	public void setCourse(Cource course) {
		this.course = course;
	}
	
	public Student(int sid, String sname, Cource course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}



App.java

package com.hibernatemapping.hibernatemappingEx;

//simport java.sql.Connection;
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
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        //is the session factory closed?
      //  System.out.println(factory.isClosed());
        
        //create the Employee class object
        Student s=new Student();
        s.setSid(101);
        s.setSname("jayashri");
        
        Cource c=new Cource();
        c.setCid(201);
        c.setCname("C Programming");// setting the cource for student object 
        s.setCourse(c);
        c.setStudent(s);
        
        Session session=factory.openSession();
        
        //begin the transaction
        
        Transaction tx=session.beginTransaction();
        session.save(s);
        session.save(c);
        tx.commit();
        session.close();
        factory.close();
    }
}


Student.java

package com.hibernatemapping.hibernatemappingEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
	private int sid;
	
	private String sname;
	@OneToOne @JoinColumn(name="Student_cource_id")
	private Cource course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Cource getCourse() {
		return course;
	}
	public void setCourse(Cource course) {
		this.course = course;
	}
	
	public Student(int sid, String sname, Cource course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


Cource.java


package com.hibernatemapping.hibernatemappingEx;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="Cource_Table")
public class Cource 
{
	@Id @Column(name="Cource_Id")
	private int cid;
	private String cname;
	@OneToOne @JoinColumn(name="Student_id")
	private Student student;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Cource(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
		//this.student = student;
	}
	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


hibernate.cfg.xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

	<hibernate-configuration>
	     <session-factory>
	        <property name="connection.driver-class">com.mysql.jdbc.Driver</property>
	        <property name="connection.url">jdbc:mysql://localhost:330/hibernateex</property>
	        <property name="connection.username">root</property>
	        <property name="connection.password">jayshri</property>
	        <property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>
	        <property name="hbm2ddl.auto">create</property>
	        <property name="show_sql">true</property>
	        <mapping class="com.hibernatemapping.hibernatemappingEx.Student"/>
	         <mapping class="com.hibernatemapping.hibernatemappingEx.Cource"/>
	     </session-factory>
	
	</hibernate-configuration>

