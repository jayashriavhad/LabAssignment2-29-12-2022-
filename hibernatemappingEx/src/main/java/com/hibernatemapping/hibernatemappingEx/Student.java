package com.hibernatemapping.hibernatemappingEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id//Assignning a primary key
	private int sid;
	private String sname;
	//Annotation use for mapping laptop and student table
	@OneToOne @JoinColumn(name="Student_Laptop_id")
	private Laptop laptop;//create object for laptop
	//create the getter and setter method
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
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	//create constructor from getter and setter
	public Student(int sid, String sname, Laptop laptop) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.laptop = laptop;
	}
	//generate object for super class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
