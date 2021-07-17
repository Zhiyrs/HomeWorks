package com.company;

class StudentData{

}
class Student {
    String birthDate;
    String familyName;
    String name;
    String gender;
    int age;

    public Student(){
        this (null,null,null,null,0);
    }

    public Student(String b,String f,String n,String g, int a){
        this.birthDate = b;
        this.familyName =f;
        this.name = n;
        this.gender = g;
        this.age = a;
    }

    public void setBirthDate(String b){
        this.birthDate = b;
    }
    public void setFamilyName(String f){
        this.familyName = f;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setGender(String g){
        this.gender = g;
    }
    public void setAge(int a){
        this.age = (a>15?a:0);
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getFamilyName() {
        return familyName;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void setStudentData(String b,String f,String n,String g, int a){
        birthDate = b;
        familyName = f;
        name = n;
        gender = g;
        age = a;
    }
    public void showStudentDetails (){
        System.out.println("Birth date: "+birthDate+ "\nSurname: "+ familyName+"\nName: "+ name+"\nGender: "+ gender+"\nAge: "+ age);
        System.out.println();
    }

}

