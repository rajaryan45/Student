package com.practical.student_prac;

public class Teacher extends Human {
	private int cls;
	private char sec;
	private int noOfStudents;
	
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

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Teacher(String name, int age, char gender) {
		super(name, age, gender);
	}

	public Teacher(String name, int age, char gender, int cls, char sec, int noOfStudents) {
		super(name, age, gender);
		this.cls = cls;
		this.sec = sec;
		this.noOfStudents = noOfStudents;
	}
	
	

}
