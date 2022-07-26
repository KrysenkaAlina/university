package com.company.service;


import com.company.model.Group;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.repository.GroupRepository;
import com.company.util.Logger;

import java.util.ArrayList;

public class GroupService {

    private GroupRepository groupRepository;
    public GroupService(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        Logger.writeLog("constructor GroupService.");
        this.groupRepository = new GroupRepository(teachers,students);
    }
    public ArrayList<Group> getGroups(){
        Logger.writeLog("GroupService.getGroups");
        return groupRepository.getGroups();
    }
    public ArrayList<Student> addStudent(Student student, ArrayList<Student> students) {
        students.add(student);
        return students;
    }
    public ArrayList<Student> delStudent(Student student, ArrayList<Student> students) {
        students.remove(student);
        return students;
    }
    void changeTeacher(ArrayList<Teacher> teacher, Group group) {
        group.setTeacher(teacher);
    }

}
