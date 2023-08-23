package com.practical.student_prac;

public class Main {

	public static void main(String[] args) {
		
//		Student refStudent = new Student("Shrishti", 21, 'F');
//		refStudent.showDetails();
		
		System.out.println("\n\n");
		Student refStudent2 = new Student("Shristhi", 23, 'F', 40, 12, 'C');
		refStudent2.showDetails();
		refStudent2.setSubjects();
		refStudent2.getSubjectsDetails();
		
		System.out.println("Raj Aryan && Shrishti Priya");
		System.out.println("Student Project for Practice");
	}

}
