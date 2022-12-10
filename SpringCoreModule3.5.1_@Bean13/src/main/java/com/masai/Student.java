package com.masai;

public class Student {
	
	    private int roll;
	    private String name;
	    private int marks;
	    
	    
	    
		public Student(int roll, String name, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}

	    
	    public void showStudent() {
	    	System.out.println("Roll     : "+roll);
	    	System.out.println("Name  : "+name);
	    	System.out.println("Marks  : "+marks);
	    	System.out.println("-------------------------------"); 
	    }
	
	

}
