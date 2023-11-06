package com.anudip.services;

import com.anudip.entities.Student;
import com.anudip.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
      @Autowired
      private StudentRepo studentRepo;

      //save student into database
      public Student registerStudent(Student student){

          Student s = new Student();
          s.setStudentId(student.getStudentId());
          s.setStudentName(student.getStudentName());
          s.setMobileNumber(student.getMobileNumber());
         return  this.studentRepo.save(s);
      }
}
