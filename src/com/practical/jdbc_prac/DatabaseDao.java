package com.practical.jdbc_prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.practical.student_prac.Student;

public class DatabaseDao {
	private static final String USER_NAME = "root";
	private static final String PSWD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/student_prac";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	protected Connection connection = null;
	protected PreparedStatement preparedStatement = null;
	protected Statement statement = null;
	protected ResultSet resultSet = null;

	protected Connection getConnection() {
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
	
	protected void closeConnections() {
		try {
			connection.close();
			preparedStatement.close();
			resultSet.close();
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
	}
	
}
