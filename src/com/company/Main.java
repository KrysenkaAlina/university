package com.company;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanova","Larisa",18,new Adress("Borisov","Pavla raka","43a",55));

        Student student2 = new Student("Petrova","ALina",20,new Adress("Borisov","Pribory","1",88));

        Student student3 = new Student("Monich","Anna",20,new Adress("Vitebsk","Sadovaya","234",3));

        Teacher teacher1 = new Teacher("Soroka","Irina",44,new Adress("Minsk","Sadovaya","43d",22));

        Teacher teacher2 = new Teacher("Megel","Dmitri",34,new Adress("Minsk","Sadovaya","55",11));

        Teacher teacher3 = new Teacher("Karaban","Vasy",36,new Adress("Minsk","Sadovaya","7",51));

        Group group1 = new Group("Group1",1,teacher1);

     //   Group group2 = new Group("Group2",3,teacher2);

        //        group1.addStudent(student1);
//        group1.addStudent(student2);
//
//        group1.printInfo();

        group1.addStudentNew(student1);
        group1.addStudentNew(student2);
        group1.toString();

        Group group2 = new Group("Group2",3,teacher2);
//        group2.addStudent(student3);
//        group2.printInfo();

        group2.addStudentNew(student3);
        group2.toString();


//        group1.delStudent(student1);
//        group1.delStudent(student2);
//        group2.addStudent(student1);
//        group2.setTeacher(teacher3);
        group1.delStudentNew(student1);
        group1.delStudentNew(student2);
        group2.addStudentNew(student1);
        group2.setTeacher(teacher3);
        student2.changeAddress(new Adress("М.Горького","Франциска Скорины", "5",5));
        teacher2.changeAddress(new Adress("Борисов>","Франциска Скорины", "6",14));
        teacher2.changeSalary(1500.66);

//        group1.printInfo();
//        group2.printInfo();
        group1.toString();
        group2.toString();

    }
}
