package com.PlacmentManagmentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PlacmentManagmentSystem.Entity.Student;



public interface StudentRepository extends JpaRepository<Student,Long>{
	@Query("Select s from Student s where s.email=?1")
    public Student findByEmail(String email);
	
	

}
