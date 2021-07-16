package com.company;

public class Parrot{

    String petsTypes;
    String name;
    String color;
    int age;
    double weight;
    String beak;

    public Parrot (String petsTypes,String name,String color,int age,double weight,String beak){
        setPets (petsTypes, name, color,age, weight, beak);
    }

    public void setPets(String petsTypes, String name, String color, int age, double weight, String beak){
        setPetsTypes (petsTypes);
        setName (name);
        setColor (color);
        setAge (age);
        setWeight (weight);
        setBeak (beak);
    }
    public void setPetsTypes (String petsTypes){
        this.petsTypes=petsTypes;
    }
    public void setName (String name){
        this.name=name;
    }
    public void setColor (String color){
        this.color=color ;
    }
    public void setAge (int age){
        this.age = (age>=0?age:0);
    }
    public void setWeight (double weight){
        this.weight = weight;
    }
    public void setBeak (String beak){
        this.beak = beak;
    }
    public String getPetsTypes(){
        return this.petsTypes;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getBeak(){
        return this.beak;
    }

    public void printParrotDetails () {
        System.out.println("Pets type: "+getPetsTypes());
        System.out.println("Name: "+getName());
        System.out.println("Color: "+getColor());
        System.out.println("Age: "+ getAge());
        System.out.println("Weight: "+ getWeight());
        System.out.println("Size of beak: "+ getBeak());
        System.out.println();
        System.out.println("   ***   ");
    }
}
