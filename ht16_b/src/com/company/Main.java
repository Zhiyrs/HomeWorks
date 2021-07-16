package com.company;

public class Main {

    public static void main(String[] args) {
		Course course = new Course();
		Course course1 = new Course("MFKO", "11/06/2021", 123456789, "Gru Despicable Me");
		Course course2 = new Course("MK", "08/04/2021", 987654321, "Cruel Devil");

		course.printDetailsOfCourse();
		course1.printDetailsOfCourse();
		course2.printDetailsOfCourse();

		StudentData.students [0]= new Student("07/12/2005", "Ivanov", "Ivan", "male", 15);
		StudentData.students [1]= new Student("19/01/2003", "Krasnova", "Lola", "female", 18);
		StudentData.students [2]= new Student("02/06/2002", "Island", "Moana", "female", 19);
		StudentData.students [3]= new Student("11/11/2004", "Potter", "Harry", "male", 17);

		Group group = new Group();
		group.getStudents();
		Group groupMfko = new Group(group.getStudents(), "MFKO" ," 11/06/2021", 2);
		Group groupMfko1 = new Group(group.getStudents(), "MFKO" ," 11/06/2021", 2);
		Group groupMK = new Group(group.getStudents(), "MFKO" ," 08/04/2021", 4);
		Group groupMK1 = new Group(group.getStudents(), "MFKO" ," 08/04/2021", 4);
		//group.printDetailsOfGroup();
		System.out.printf("MFKO: %s \nMK: %s", groupMfko,groupMfko1, groupMK,groupMK1);



	}
}
