package com.practical.student_prac;

import java.sql.ResultSet;

import com.practical.jdbc_prac.StudentDao;

public class Main {

	public static void main(String[] args) {
		
//		Student refStudent = new Student("Shrishti", 21, 'F');
//		refStudent.showDetails();
		
		System.out.println("\n\n");
		Student refStudent2 = new Student("Raju", 23, 'M', 40, 12, 'C');
		StudentDao studentDao = new StudentDao();
		
		
		ResultSet rSet = studentDao.showStudent();
		ResultSet rSet1 = studentDao.getStudentByclssec(12,"B");
		ResultSet rSet2 = studentDao.getStudentBygenage("F", 23);
		ResultSet rSet3 = studentDao.getStudentByadmnid(2);
		
		try {
			System.out.println("rset");
			while(rSet.next())
			{
			   System.out.println("name : " + rSet.getString(1) + " age : " + rSet.getString(2) );	
			}
			System.out.println("rset1");
			while(rSet1.next())
			{
			   System.out.println("class : " + rSet1.getString(1) + " sec : " + rSet1.getString(2) );	
			}
			System.out.println("rset2");
			while(rSet2.next())
			{
			   System.out.println("gender : " + rSet2.getString(1) + " age : " + rSet2.getString(2) );	
			}
			System.out.println("rset3");
			while(rSet3.next())
			{
			   System.out.println("name : " + rSet3.getString(1) + " age : " + rSet3.getString(2) + " gender : " + rSet3.getString(3) + " class : " + rSet3.getString(6) + " age : " + rSet3.getString(7) );	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("Raj Aryan && Shrishti Priya");
		System.out.println("Student Project for Practice");
	}

}
