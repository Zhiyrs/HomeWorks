package com.company;

public class Course {

    private String nameOfCourse;
    String date;
    int ID;
    String teachersName;

    public Course() {
        this (null, null, 0, null);
    }
    public Course(String nameOfCourse, String date, int ID, String teachersName) {
        setCourse (nameOfCourse, date, ID,teachersName);
    }
    public void setCourse (String nameOfCourse, String date, int ID, String teachersName){
        setNameOfCourse (nameOfCourse);
        setDate (date);
        setID (ID);
        setTeachersName (teachersName);
    }
    public void setNameOfCourse (String nameOfCourse){
        this.nameOfCourse = nameOfCourse;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public String getDate() {
        return date;
    }

    public int getID() {
        return ID;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void printDetailsOfCourse(){
        System.out.println("Course: "+getNameOfCourse());
        System.out.println("Date of beginning: "+getDate());
        System.out.println("ID number: " + getID());
        System.out.println("Teacher's data: "+getTeachersName());
        System.out.println();
        System.out.println("   ***   ");
    }

}
