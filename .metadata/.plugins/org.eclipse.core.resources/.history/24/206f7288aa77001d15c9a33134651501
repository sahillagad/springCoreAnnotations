package com.masai.Dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Student;
import com.masai.Utility.EMUtility;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private EMUtility utility;
	
	
	
	


	public void setUtility(EMUtility utility) {
		this.utility = utility;
	}

	@Override
	public boolean addStudent(Student student) {
		boolean  b=false;
		
	     EntityManager em= utility.provideEntityManager();
		
		
	     em.getTransaction().begin();
		
		
	     em.persist(student);
		  b=true;
	     
	     em.getTransaction().commit();
 
	      em.close();
	 return b; 
	}

	@Override
	public Student findStudentByRoll(int RollNO) {
      Student  student=null;
		 
       EntityManager em= utility.provideEntityManager();
		
        student= em.find(Student.class, RollNO);
      
      
      
      return student;
	}

	@Override
	public String romoveStudent(int RollNo) {
		String result="Student is not Remove";
		EntityManager em= utility.provideEntityManager();
		Student student=em.find(Student.class,RollNo);
		
		
         if(student!=null) {
        	 em.getTransaction().begin();
        	 
        	 
        	em.remove(student);
              result="Student is Rove Successfully...";
        	 
        	em.getTransaction().commit();
        	 
         }
         else {
        	 
        	 result="Student is not present By given Roll Number";
         }
		return result;
        
	}

	@Override
	public String updateStudent(Student student) {
		
		String result="Student is Not Update...."; 
		
	     EntityManager em= utility.provideEntityManager();
		
		
	     em.getTransaction().begin();
		
		
	     em.persist(student);
		  result="Student is Update..";
	     
	     em.getTransaction().commit();

	      em.close();
	 return result; 
	}
	

}
