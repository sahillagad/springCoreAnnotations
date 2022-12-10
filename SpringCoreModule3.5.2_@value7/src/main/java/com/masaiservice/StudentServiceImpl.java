package com.masaiservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.masai.Dao.StudentDaoImpl;
import com.masaiEntity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoImpl daoImpl;
	
	
	@Override
	public String saveStudent(Student student) {
		return daoImpl.saveStudent(student);
	}

	@Override
	public Student findStudent(int Roll) {
		return  daoImpl.findStudent(Roll);
	}

	@Override
	public String updateStudent(Student student) {
		return daoImpl.updateStudent(student); 
	}

	@Override
	public String deleteStudent(int Roll) {
		return daoImpl.deleteStudent(Roll);
	}

	@Override
	public void getAllStudent() {
		        daoImpl.getAllStudent();    		
	}

	
	
	
}
