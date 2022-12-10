package com.masaiservice;

import com.masaiEntity.Student;

public interface StudentService {

	public String saveStudent(Student student);
	public Student findStudent(int Roll);

	public String updateStudent(Student student) ;
	public String deleteStudent(int Roll);
    public void getAllStudent();
   
   
   
	
}
