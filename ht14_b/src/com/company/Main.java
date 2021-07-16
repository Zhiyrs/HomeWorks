package com.company;

public class Main {

    public static void main(String[] args) {
        Citizen citizen1 = new Citizen();
        Citizen citizen2 = new Citizen();

        citizen1.name = "Khiva";
        citizen1.surname = "Uzb";
        citizen1.address = "Tashkent st. 145";
        citizen1.personalNumber = 123456789;
        citizen2.name = "Adler";
        citizen2.surname = "Rus";
        citizen2.address = "Sochi st. 78";
        citizen2.personalNumber = 987654321;

        System.out.println ("Фамилия: "+citizen1.name);
        System.out.println ("Имя: "+citizen1.surname);
        System.out.println ("Адрес: "+ citizen1.address);
        System.out.println ("ИНН: " +citizen1.personalNumber);
        System.out.println();
        System.out.println ("Фамилия: "+citizen2.name);
        System.out.println ("Имя: "+citizen2.surname);
        System.out.println ("Адрес: "+ citizen2.address);
        System.out.println ("ИНН: " +citizen2.personalNumber);

    }
}
