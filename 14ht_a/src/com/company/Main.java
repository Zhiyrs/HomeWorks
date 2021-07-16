package com.company;

public class Main {

    public static void main(String[] args) {
        Student fastNet = new Student();

        fastNet.name = "Fast";
        fastNet.surname ="Light";
        fastNet.group = "Mb 20-15";
        fastNet.age = 22;
        System.out.println( "Фамилия: "+fastNet.name+"\nИмя: "+fastNet.surname+"\nГруппа: "+fastNet.group+"\nВозраст: "+fastNet.age);

        Student megaLine = new Student();
        megaLine.name = "Mega";
        megaLine.surname ="Max";
        megaLine.group = "Mb 80-75";
        megaLine.age = 18;
        System.out.println();
        System.out.println( "Фамилия: "+megaLine.name+"\nИмя: "+megaLine.surname+"\nГруппа: "+megaLine.group+"\nВозраст: "+megaLine.age);

        Student homeLine = new Student();
        homeLine.name = "Home";
        homeLine.surname ="Min";
        homeLine.group = "Mb 75-60";
        homeLine.age = 20;
        System.out.println();
        System.out.println( "Фамилия: "+homeLine.name+"\nИмя: "+homeLine.surname+"\nГруппа: "+homeLine.group+"\nВозраст: "+homeLine.age);
    }
}
