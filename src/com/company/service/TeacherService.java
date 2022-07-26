package com.company.service;

import com.company.model.Adress;
import com.company.model.Teacher;
import com.company.repository.TeacherRepository;
import java.util.ArrayList;

public class TeacherService {

    private TeacherRepository teacherRepository;

    public	TeacherService (){
        this.teacherRepository = new TeacherRepository();
    }
    public ArrayList<Teacher> getTeachers(){

        return teacherRepository.getTeachers();
    }
    void changeSalary(double salary, Teacher teacher) {
        teacher.setSalary(salary);
    }
    void changeAddress(Adress address, Teacher teacher){
        teacher.setAdress(address);
    }


}
