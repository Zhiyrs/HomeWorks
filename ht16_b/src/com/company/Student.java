package com.company;

public class Student {
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

        System.out.printf("Student data: %s\n", this);
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

    public String toString(){
        return String.format("\n birth: %s\n Second name: %s\n First name: %s\n age: %s\n gender: %s\n ", birthDate,familyName,name,age,gender);
    }
}

