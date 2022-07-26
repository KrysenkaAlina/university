package com.company;

import com.company.model.Adress;
import com.company.model.Methodist;
import com.company.model.Group;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.service.GroupService;
import com.company.service.MethodistService;
import com.company.service.StudentService;
import com.company.service.TeacherService;
import com.company.util.Converter;
import com.company.util.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.writeLog("Start project.");
        ArrayList<Teacher> teachers = null;
        TeacherService teacherService = new TeacherService();
        teachers = teacherService.getTeachers();
        for (Teacher t: teachers) {
            logger.writeLog(t.toString());
        }
        ArrayList<Student> students = null;
        StudentService studentService = new StudentService();
        students = studentService.getStudents();
        for (Student t: students) {
            logger.writeLog(t.toString());
        }
        ArrayList<Methodist> methodists = null;
        MethodistService methodistService = new MethodistService(teachers);
        methodists = methodistService.getMethodists();
        for (Methodist t: methodists) {
            logger.writeLog(t.toString());
        }
        ArrayList<Group> groups = null;
        GroupService groupService = new GroupService(teachers,students);
        groups = groupService.getGroups();
        for (Group t: groups) {
            logger.writeLog(t.toString());
        }
        //сортировка студентов по возрасту
     //   AgeComporator ageComporator = new AgeComporator();
    //    students.stream()
    //            .sorted(ageComporator)
    //            .forEach(student -> logger.writeLog(student.toString()));

    }
}
