package com.crudapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.entity.Student;

import com.crudapi.services.studentservices;

@RestController
@RequestMapping("/student")
public class crudapi {
	@Autowired
	private studentservices studentservices;
	
	@PostMapping
	public ResponseEntity<Student> create(@RequestBody Student student){
		Student std = studentservices.savestudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(std);
		
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAll(){
		List<Student> allstd = studentservices.getAllStudent();
		return ResponseEntity.ok(allstd);
	}
	@GetMapping("/{stdid}")
	public ResponseEntity<Optional<Student>> getStd(@PathVariable int stdid){
		Optional<Student> std2 = studentservices.getstudent(stdid);
		return ResponseEntity.ok(std2);
	}

}
