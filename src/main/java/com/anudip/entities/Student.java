package com.anudip.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String mobileNumber;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Student(int studentId, String studentName, String mobileNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
    }

    public Student() {
    }
}
//annotation :: -> lombok