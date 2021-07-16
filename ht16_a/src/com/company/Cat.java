package com.company;

public class Cat{

    String petsTypes;
    String name;
    String color;
    int age;
    double weight;
    String tail;

    public Cat (String petsTypes,String name,String color,int age,double weight,String tail){
        setPets (petsTypes, name, color,age, weight, tail);
    }

    public void setPets(String petsTypes, String name, String color, int age, double weight, String tail){
        setPetsTypes (petsTypes);
        setName (name);
        setColor (color);
        setAge (age);
        setWeight (weight);
        setTail (tail);
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
    public void setTail (String tail){
        this.tail = tail;
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
    public String getTail(){
        return this.tail;
    }

    public void printCatDetails () {
        System.out.println("Pets type: "+getPetsTypes());
        System.out.println("Name: "+getName());
        System.out.println("Color: "+getColor());
        System.out.println("Age: "+ getAge());
        System.out.println("Weight: "+ getWeight());
        System.out.println("Tail: "+ getTail());
        System.out.println();
        System.out.println("   ***   ");
    }

}
