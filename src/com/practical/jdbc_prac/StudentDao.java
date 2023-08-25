package com.practical.jdbc_prac;

import com.practical.student_prac.Student;

public class StudentDao extends DatabaseDao{
	
	public void setStudentData(Student refStudent) {
		connection = getConnection();
		preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Query.INSERT_STUDENT);
			preparedStatement.setString(1, refStudent.getName());
			preparedStatement.setInt(2, refStudent.getAge());
			preparedStatement.setString(3, String.valueOf(refStudent.getGender()));
			preparedStatement.setInt(4, refStudent.getCls());
			preparedStatement.setString(5, String.valueOf(refStudent.getSec()));
			preparedStatement.execute();
			System.out.println("success ");
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}finally {
			closeConnections();
		}
	}
}
