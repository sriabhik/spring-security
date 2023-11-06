package com.anudip.repositories;


import com.anudip.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//interface JpaRepository -> interface :: sare logic ki kaisee perfrom krna h crud ko
//class -> interface ::

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
