package com.company.repository;

import com.company.model.Teacher;
import com.company.util.Logger;
import com.company.util.ParseUtils;
import java.util.ArrayList;

public class TeacherRepository {

    private ArrayList<Teacher> teachers;
    public TeacherRepository(){
        Logger.writeLog("constructor TeacherRepository");
        this.teachers = ParseUtils.LoadTeachers("filePeople.txt");
    }

    public ArrayList<Teacher> getTeachers() {
        Logger.writeLog("TeacherRepository.getTeachers");
        return teachers;
    }
}
