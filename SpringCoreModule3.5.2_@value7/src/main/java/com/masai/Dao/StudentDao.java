package com.masai.Dao;

import com.masaiEntity.Student;

public interface StudentDao {

	public String saveStudent(Student student);
	public Student findStudent(int Roll);

	public String updateStudent(Student student) ;
	public String deleteStudent(int Roll);
    public void getAllStudent();
   
   
}
