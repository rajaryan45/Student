package com.practical.student_pac;

public class Main {

	public static void main(String[] args) {
		
		Student refStudent = new Student("Shrishti", 21, 'F');
		refStudent.showDetails();
		
		System.out.println("\n\n");
		Student refStudent2 = new Student("Raj", 23, 'M', 41, 12, 'C');
		refStudent2.showDetails();
		
		System.out.println("Raj Aryan && Shrishti Priya");
		System.out.println("Student Project for Practice");
	}

}
