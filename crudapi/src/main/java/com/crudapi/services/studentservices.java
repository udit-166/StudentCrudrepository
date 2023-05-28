package com.crudapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapi.entity.Student;
import com.crudapi.repository.studentrepository;


@Service
public class studentservices {
	@Autowired
	private studentrepository studentrepository;
	
	public List<Student> getAllStudent(){
		return (List<Student>) studentrepository.findAll();
	}
	public Student savestudent(Student student) {
		return studentrepository.save(student);
	}
	public Optional<Student> getstudent(int id) {
		Optional<Student> student = studentrepository.findById(id);
		return student;
	}
}
