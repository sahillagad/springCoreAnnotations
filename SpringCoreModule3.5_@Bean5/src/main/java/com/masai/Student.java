package com.masai;

public class Student {

	 
	private int Roll;
	private String name;
	private int marks;
	public Student(int roll, String name, int marks) {
		super();
		Roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
