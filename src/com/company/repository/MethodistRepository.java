package com.company.repository;

import com.company.model.Methodist;
import com.company.model.Teacher;
import com.company.util.Logger;
import com.company.util.ParseUtils;

import java.util.ArrayList;

public class MethodistRepository {

    private ArrayList<Methodist> methodists;
    public MethodistRepository(ArrayList<Teacher> teachers){
        Logger.writeLog("constructor MethodistRepository");
        this.methodists = ParseUtils.LoadMethodist("Methodist.txt",teachers);
    }

    public ArrayList<Methodist> getMethodists() {
        Logger.writeLog("MethodistRepository.getMethodists");
        return methodists;
    }
}
