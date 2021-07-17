package com.company;

public class Main {

    public static void main(String[] args) {
		Course course = new Course();
		Course course1 = new Course("MFKO", "11/06/2021", 123456789, "Gru Despicable Me");
		Course course2 = new Course("MK", "08/04/2021", 987654321, "Cruel Devil");

		course.printDetailsOfCourse();
		course1.printDetailsOfCourse();
		course2.printDetailsOfCourse();

		Student[]students = new Student[4];
		students [0]= new Student();
		students [1]= new Student();
		students [2]= new Student();
		students [3]= new Student();

		students [0].setStudentData("07/12/2005", "Ivanov", "Ivan", "male", 15);
		students [1].setStudentData("19/01/2003", "Krasnova", "Lola", "female", 18);
		students [2].setStudentData("02/06/2002", "Island", "Moana", "female", 19);
		students [3].setStudentData("11/11/2004", "Potter", "Harry", "male", 17);

		Group group = new Group();
		Group groupMfko = new Group(students [0], "MFKO" ," 11/06/2021", 2);
		Group groupMfko1 = new Group(students [1], "MFKO" ," 11/06/2021", 2);
		Group groupMK = new Group(students [2], "MFKO" ," 08/04/2021", 4);
		Group groupMK1 = new Group(students [3], "MFKO" ," 08/04/2021", 4);

		System.out.print("Student data: ");
		students [0].showStudentDetails();
		groupMfko.showGroupDetails();
		System.out.print("Student data: ");
		students [1].showStudentDetails();
		groupMfko1.showGroupDetails();
		System.out.print("Student data: ");
		students [2].showStudentDetails();
		groupMK.showGroupDetails();
		System.out.println("Student data: ");
		students [3].showStudentDetails();
		groupMK1.showGroupDetails();


		//System.out.println("Student 1: ");
		//students[0].showStudentDetails();

	}

}
