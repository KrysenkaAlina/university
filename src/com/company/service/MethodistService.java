package com.company.service;

import com.company.model.Methodist;
import com.company.model.Teacher;
import com.company.repository.MethodistRepository;
import com.company.util.Converter;
import com.company.util.Logger;

import java.util.ArrayList;

public class MethodistService {
    private MethodistRepository methodistRepository;
    public MethodistService(ArrayList<Teacher> teachers) {
        Logger.writeLog("constructor MethodistService.");
        this.methodistRepository = new MethodistRepository(teachers);
    }
    public ArrayList<Methodist> getMethodists(){
        Logger.writeLog("MethodistService.getMethodists");
        return methodistRepository.getMethodists();
    }
    public void TeacherToMethodist(Teacher teacher, ArrayList<Methodist> methodists, ArrayList<Teacher> teachers){
        Converter<Teacher, Methodist> converter = x -> new Methodist(x.getId(),x.getName(), x.getLastName(), x.getAge(),x.getAdress(),x.getSalary(),teachers);
        Methodist methodist = converter.convert(teacher);
        methodists.add(methodist);
        teachers.remove(teacher);
    }
}
