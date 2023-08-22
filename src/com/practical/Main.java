package com.practical;

public class Main {

	public static void main(String[] args) {
		
		Student refStudent = new Student("Shrishti", 21, 'F');
		refStudent.showDetails();
		
		System.out.println("\n\n");
		Student refStudent2 = new Student("Raj", 23, 'M', 41, 12, 'C');
		refStudent2.showDetails();
		
		System.out.println("Raj Aryan && Shrishti Priya");

	}

}
