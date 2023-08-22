package com.practical;

public class Student extends Human{

	private int roll;
	private int cls;
	private char sec;
	
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}

	public Student(String name, int age, char gender, int roll, int cls, char sec) {
		super(name, age, gender);
		this.roll = roll;
		this.cls = cls;
		this.sec = sec;
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
	
	
	
	
	
	
	 
}
