package com.practical.jdbc_prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.practical.student_prac.Student;

public class DatabaseDao {
	private static final String USER_NAME = "root";
	private static final String PSWD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/student_prac";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	private Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER_NAME, PSWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
	
	public void setStudentData(Student refStudent) {
		Connection connection = getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(Query.INSERT_STUDENT);
			statement.setString(1, refStudent.getName());
			statement.setInt(2, refStudent.getAge());
			statement.setString(3, String.valueOf(refStudent.getGender()));
			statement.setInt(4, refStudent.getCls());
			statement.setString(5, String.valueOf(refStudent.getSec()));
			statement.execute();
			System.out.println("success ");
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
	}
}
