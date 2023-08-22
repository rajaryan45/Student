package com.practical.student_prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Human{

	private int roll;
	private int cls;
	private char sec;
	private int subCount=0;
	private ArrayList<Subject> subjects ;

	
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}
	public Student(String name, int age, char gender, int roll, int cls, char sec) {
		super(name, age, gender);
		this.roll = roll;
		this.cls = cls;
		this.sec = sec;
	}
	
	public int getSubCount() {
		return subCount;
	}
	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}

	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	
	public void setSubjects()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of subjects:");
			this.setSubCount(sc.nextInt());
			sc.nextLine();
			
			for(int i=0;i<this.subCount;i++) {
				Subject refSubject = new Subject();
				System.out.println("\nEnter Subject " +(i+1) + "name :" );
				refSubject.setSubName(sc.nextLine());
				System.out.println("Enter Mark " +(i+1) + " : ");
				refSubject.setMarks(sc.nextInt());
				sc.nextLine();
				subjects.add(refSubject);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	public void showDetails() {
		System.out.println("Name : " + this.getName() + "\nAge : " + this.getAge() + "\nGender : " +this.getGender() );
		System.out.println("Roll : " + this.getRoll() + "\nClass : " + this.getCls() + "\nSection : " +this.getSec());
	}
	 
}
