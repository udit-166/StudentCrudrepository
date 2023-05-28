package com.crudapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudapi.entity.Student;

public interface studentrepository extends CrudRepository<Student, Integer>{

}
