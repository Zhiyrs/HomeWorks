package com.company;

public class Group {
    Student [] students;
    int grade;
    int lastingInMonth;

      public Group(){
        this (null,0,0);
    }
    public Group(Student[]students, int grade,int lastingInMonth){
        this.students =students;
        this.grade=grade;
        this.lastingInMonth = lastingInMonth;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getLastingInMonth() {
        return lastingInMonth;
    }

    public void setLastingInMonth(int lastingInMonth) {
        this.lastingInMonth = lastingInMonth;
    }
   // public void printDetailsOfGroup(){
      //  System.out.println("Student : "+ students.length);
      //  System.out.println("Course: "+ Course.getNameOfCourse());
       // System.out.println("Date of beginning: "+Course.getDate());
       // System.out.println("ID number: " + );
      //  System.out.println("Teacher's data: "+());s
      //  System.out.println();
      //  System.out.println("   ***   ");
    //}

}
