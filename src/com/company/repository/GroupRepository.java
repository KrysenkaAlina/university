package com.company.repository;

import com.company.model.Group;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.util.Logger;
import com.company.util.ParseUtils;

import java.util.ArrayList;

public class GroupRepository {

    private ArrayList<Group> groups;
    public GroupRepository(ArrayList<Teacher> teachers, ArrayList<Student> students){
        Logger.writeLog("constructor GroupRepository");
        this.groups = ParseUtils.LoadGroups("Group.txt",teachers,students);
    }

    public ArrayList<Group> getGroups() {
        Logger.writeLog("GroupRepository.getGroups");
        return groups;
    }
}
