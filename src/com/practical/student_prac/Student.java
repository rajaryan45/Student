package com.practical.student_prac;

import java.util.ArrayList;
import java.util.Scanner;

import com.practical.jdbc_prac.StudentDao;

public class Student extends Human{

	private int roll;
	private int cls;
	private char sec;
	private int subCount=0;
	private ArrayList<Subject> subjectsArrayList;

	
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}
	public Student(String name, int age, char gender, int roll, int cls, char sec) {
		super(name, age, gender);
		this.roll = roll;
		this.cls = cls;
		this.sec = sec;		
		StudentDao studentDao = new StudentDao();
		studentDao.setStudentData(this);
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
			subjectsArrayList = new ArrayList<Subject>(subCount);
			for(int i=0;i<this.subCount;i++) {
				Subject refSubject = new Subject();
				System.out.println("\nEnter Subject " +(i+1) + " name :" );
				String nameString = sc.nextLine();
				refSubject.setSubName(nameString);
				System.out.println("Enter Mark " +(i+1) + " : ");
				int mark = sc.nextInt();
				sc.nextLine();
				refSubject.setMarks(mark);
				subjectsArrayList.add(refSubject);
			}
		}catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
			
	}
	public void getSubjectsDetails() {
		try {
			System.out.println("\nNumber of Subjects : " + this.getSubCount());
			for(int i = 0 ; i<this.getSubCount();i++) {
				System.out.println("\nSubject Name : "+subjectsArrayList.get(i).getSubName() + "\nMark : " + subjectsArrayList.get(i).getMarks());
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
	}
	public void showDetails() {
		System.out.println("Name : " + this.getName() + "\nAge : " + this.getAge() + "\nGender : " +this.getGender() );
		System.out.println("Roll : " + this.getRoll() + "\nClass : " + this.getCls() + "\nSection : " +this.getSec());
	}
	 
}
