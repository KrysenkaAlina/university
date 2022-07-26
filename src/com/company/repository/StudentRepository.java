package com.company.repository;

import com.company.model.Student;
import com.company.util.Logger;
import com.company.util.ParseUtils;

import java.util.ArrayList;

public class StudentRepository {

    private ArrayList<Student> students;
    public StudentRepository(){
        Logger.writeLog("constructor StudentRepository");
        this.students = ParseUtils.LoadStudents("filePeople.txt");
    }

    public ArrayList<Student> getStudents() {
        Logger.writeLog("StudentRepository.getStudents");
        return students;
    }
}
