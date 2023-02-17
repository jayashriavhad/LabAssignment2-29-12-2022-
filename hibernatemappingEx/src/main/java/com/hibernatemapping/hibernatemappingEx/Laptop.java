package com.hibernatemapping.hibernatemappingEx;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="Laptop_Table")
class Laptop
{
	@Id @Column(name="Laptop_Id")//Assignning a primary key
	private int id;
	private String comp_name;
	//join the two column
	@OneToOne @JoinColumn(name="Student_id")
	//create object for student table
	private Student student;
	//generate getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	//create constructor from getter and setter
	public Laptop(int id, String comp_name, Student student) {
		super();
		this.id = id;
		this.comp_name = comp_name;
		this.student = student;
	}
	//generate object for super class
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
		

}
