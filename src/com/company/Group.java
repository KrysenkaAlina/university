package com.company;

import java.util.ArrayList;

public class Group {

        public String name;
        public int course;
        private Student[] students = new Student[0];
        private ArrayList<Student> arStudents = new ArrayList<>();
        private Teacher teacher;

        public Group(String name, int course, Teacher teacher) {
            this.name = name;
            this.course = course;
            this.teacher = teacher;
        }

        public Group(String name, int course) {
            this.name = name;
            this.course = course;;
        }

        void getTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        void getName(String name) {
            this.name = name;
        }

        void setName(String name) {
            this.name = name;
        }

        void getCourse(int course) {
            this.course = course;
        }

        void setCourse(int course) {
            this.course = course;
        }


        void changeSalary(double salary) {
            this.teacher.changeSalary(salary);
        }

        void addStudent(Student student) {
            Student[] students = new Student[this.students.length+1];
            for (int i=0;i<this.students.length;i++){
                students[i] = this.students[i];
            }
            students[students.length-1]=student;
            this.students = students;
        }
        void addStudentNew(Student student) {
            this.arStudents.add(student);
        }
        void delStudent(Student student) {
            boolean findFlag=false;
            if (this.students.length==1){
                this.students = null;
                System.out.println("this.students = null;");
            }
            else if (this.students.length>1){
                Student[] students = new Student[this.students.length-1];
                for (int i=0;i<this.students.length;i++){
                    if (findFlag==true){
                        students[i-1] = this.students[i];
                    }
                    else if (this.students[i].equals(student)){
                        findFlag=true;
                    }
                    else {
                        students[i] = this.students[i];
                    }
                }
                this.students = students;
            }
        }

        void delStudentNew(Student student) {
            this.arStudents.remove(student);
        }

        public String toString() {
            //System.out.printf("Group info:\nName: %s, course: %d\n", this.name, this.course);
            if (!this.arStudents.isEmpty()) {
                this.arStudents.forEach((student) -> student.printInfo());
            }
            this.teacher.dispInfo();
            return "Group info:" + this.name + ": %s, course: "+this.course;
        }


}
