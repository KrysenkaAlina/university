package com.company.util;

import com.company.model.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

public class ParseUtils {

    private static int type_people;
    private static String type_metod;
    private static int id;
    private static double salary;
    private static Adress adress = null;

    public static ArrayList<Student> LoadStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<Student>();
        Logger.writeLog("Начало загрузки студентов");
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            try {
                String s;
                while ((s = input.readLine()) != null) {
                    Logger.writeLog("fileLine: "+s);
                    String[] student = s.split(" ");
                    try {
                        type_people = Integer.parseInt(student[8]);
                    } catch (Exception e) {
                        type_people = 0;
                        Logger.writeLog("Не указан признак "+student[1]);
                    }
                    if (type_people == 1) {
                        adress = new Adress(student[4], student[5], student[6], Integer.parseInt(student[7]));
                        students.add(new Student(Integer.parseInt(student[0]), student[1], student[2], Integer.parseInt(student[3]), adress));
                    } else
                    {
                        Logger.writeLog("Данная запись не относится к студентам "+student[1]);
                    }
                }
            } finally {
                input.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Logger.writeLog("Конец загрузки студентов. количество:"+students.size());
        return students;
    }
    public static ArrayList<Teacher> LoadTeachers(String fileName) {
        Logger.writeLog("Начало загрузки преподователей");
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            try {
                String s;
                while ((s = input.readLine()) != null) {
                    Logger.writeLog("fileLine: "+s);
                    String[] teacher = s.split(" ");
                    try {
                        type_people = Integer.parseInt(teacher[8]);
                    } catch (NumberFormatException e) {
                        type_people = 0;
                        Logger.writeLog("Не указан признак "+teacher[0]);
                    }
                 //   try {
                //        salary = Double.parseDouble(teacher[9]);
                //    } catch (NumberFormatException e){
                //        salary = 0;
                //        Logger.writeLog("Не удалось сконвертировать занчение з/п для преподавателя "+teacher[1]);
               //     }
                    if (type_people == 2) {
                        adress = new Adress(teacher[4], teacher[5], teacher[6], Integer.parseInt(teacher[7]));
                        teachers.add(new Teacher(Integer.parseInt(teacher[0]),teacher[1], teacher[2], Integer.parseInt(teacher[3]), adress, salary));
                    } else {
                        Logger.writeLog("Данная запись не относится к проподователям "+teacher[1]);
                    }
                    }
            } finally {
                input.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Logger.writeLog("Конец загрузки преподователей. количество:"+teachers.size());
        return teachers;
    }

    public static ArrayList<Methodist> LoadMethodist(String fileName , ArrayList<Teacher> teachersMet) {
        Logger.writeLog("Начало загрузки методистов");
        ArrayList<Methodist> methodists = new ArrayList<Methodist>();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            try {
                String s;
                while ((s = input.readLine()) != null) {
                    Logger.writeLog("fileLine: "+s);
                    String[] methodist = s.split(" ");
                    try {
                        id = Integer.parseInt(methodist[0]);
                    } catch (NumberFormatException e) {
                        id = 0;
                        Logger.writeLog("Методист без айди "+methodist[1]);
                    }
                    adress = new Adress(methodist[4],methodist[5],methodist[6],Integer.parseInt(methodist[7]));
                    methodists.add(new Methodist(Integer.parseInt(methodist[0]),methodist[1],methodist[2], Integer.parseInt(methodist[3]),adress,Integer.parseInt(methodist[8]),teachersMet));
                }
            } finally {
                input.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Logger.writeLog("Конец загрузки методичстов. количество:"+methodists.size());
        return methodists;
    }

    public static ArrayList<Group> LoadGroups(String fileName,ArrayList<Teacher> teachersMet, ArrayList<Student> studentsMet) {
        Logger.writeLog("Старт загрузки групп");
        ArrayList<Group> groups = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            try {
                String s;
                while ((s = input.readLine()) != null) {
                    String[] group = s.split(" ");
                    ArrayList<Student> students = new ArrayList<Student>();
                    groups.add(new Group(group[0],Integer.parseInt(group[1]),studentsMet,teachersMet));
                }
            } finally {
                input.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Logger.writeLog("Конец загрузки групп. Количество:"+groups.size());
        return groups;
    }

}
