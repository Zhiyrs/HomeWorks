package com.company;

public class Group {
    static Student []students;
    private static String nameOfCourse;
    String date;
    int lastingInMonth;

    public Group(){
        this (null,null,null,0);
    }

    public Group(Student[]students, String nameOfCourse, String date, int lastingInMonth){
        this.students = students;
        this.nameOfCourse=nameOfCourse;
        this.date = date;
        this.lastingInMonth = lastingInMonth;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate(String date) {
        return date;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(int grade) {
        this.nameOfCourse = nameOfCourse;
    }

    public int getLastingInMonth() {
        return lastingInMonth;
    }

    public void setLastingInMonth(int lastingInMonth) {
        this.lastingInMonth = lastingInMonth;
    }
    public void printDetailsOfGroup(){
        for (int i = 0;i<4; i++){
            System.out.println(StudentData.students [i].birthDate+
                    " "+StudentData.students [i].familyName+
                    " "+StudentData.students [i].name+
                    " "+StudentData.students [i].gender+
                    " "+StudentData.students [i].age);
        }
        System.out.println("Course: "+ Course.getNameOfCourse());
        System.out.println("Date of beginning: "+Course.getDate());
        System.out.println();
        System.out.println("   ***   ");
    }



}
