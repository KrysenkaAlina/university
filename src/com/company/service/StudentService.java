package com.company.service;

import com.company.model.Adress;
import com.company.model.Student;
import com.company.repository.StudentRepository;

import java.util.ArrayList;

public class StudentService {

    private StudentRepository studentRepository;
    public StudentService() {
        this.studentRepository = new StudentRepository();
    }
    public ArrayList<Student> getStudents(){
        return studentRepository.getStudents();
    }
    void changeAddress(Adress address, Student student){
        student.setAdress(address);
    }
}
