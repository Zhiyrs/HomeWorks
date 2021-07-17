package com.company;

public class Group {
    Student students;
    private String nameOfCourse;
    String date;
    int lastingInMonth;

    public Group(){
        this (null,null,null,0);
    }

    public Group(Student students, String nameOfCourse, String date, int lastingInMonth){
        this.students = students;
        this.nameOfCourse=nameOfCourse;
        this.date = date;
        this.lastingInMonth = lastingInMonth;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
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
    public void showGroupDetails (){
        System.out.println("Course: " + getNameOfCourse());
        System.out.println("Date: " +getDate());
        System.out.println("Duration: "+getLastingInMonth());
        System.out.println("   ---   ");
        System.out.println();
    }
}
