package com.company;

public class Main {

    public static void main(String[] args) {
	    Fish fishObject = new Fish("Fish","Bibi", "Golden", 3,0.300);
	    Fish fishObject2 = new Fish("Fish","Kiki", "Black", 1,0.150);
        Fish fishObject3 = new Fish("Fish","Mimi", "Red", -3,0.200);

        Parrot parrotObject = new Parrot("Parrot","Bulka", "Red", 5,2.5, "small");
        Parrot parrotObject2 = new Parrot("Parrot","Meow", "Blue", 3,4.3, "medium");
        Parrot parrotObject3 = new Parrot("Parrot","Cruel", "White", 9,1.9, "big");

        Dog dogObject = new Dog("Dog","Kesha", "Brown", 12,3, "no");
        Dog dogObject2 = new Dog("Dog","Kisa", "White", 7,4.8, "yes");
        Dog dogObject3 = new Dog("Dog","Kuzya", "Golden", 2,9.1, "no");

        Cat catObject = new Cat("Cat","Gav", "Black", 5,2, "yes");
        Cat catObject2 = new Cat("Cat","Mr", "Gray", 1,7, "yes");
        Cat catObject3 = new Cat("Cat","Zero", "Black and white", 3,4.1, "yes");

        fishObject.printFishDetails();
        fishObject2.printFishDetails();
        fishObject3.printFishDetails();

        parrotObject.printParrotDetails();
        parrotObject2.printParrotDetails();
        parrotObject3.printParrotDetails();

        dogObject.printDogDetails();
        dogObject2.printDogDetails();
        dogObject3.printDogDetails();

        catObject.printCatDetails();
        catObject2.printCatDetails();
        catObject3.printCatDetails();


    }
}
