package com.practical.jdbc_prac;

import java.sql.ResultSet;

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
	public ResultSet showStudent()
	{
		connection = getConnection();
		preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Query.SELECT_ALL_STUDENT);
			resultSet = preparedStatement.executeQuery();
			
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
		return resultSet;
				
	}
	
	public ResultSet getStudentByclssec(int cls,String sec)
	{
		connection = getConnection();
		preparedStatement = null;
	   try {
		   preparedStatement = connection.prepareStatement(Query.SELECT_BY_CLS_SEC);
		   preparedStatement.setString(1, Integer.toString(cls));
		   preparedStatement.setString(2, sec);
		   resultSet = preparedStatement.executeQuery();
	} catch (Exception e) {
		System.out.println("Exception : " + e.getMessage() + " : " );
		e.printStackTrace();
	}
		return resultSet;
	}
	public ResultSet getStudentBygenage(String gender,int age)
	{
		connection = getConnection();
		preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Query.SELECT_BY_GEN_AGE);
			preparedStatement.setString(1, gender);
			preparedStatement.setString(2, Integer.toString(age));
			resultSet = preparedStatement.executeQuery();
			
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
		return resultSet;
	}
	public ResultSet getStudentByadmnid(int adminid)
	{
		connection = getConnection();
		preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Query.SELECT_BY_ADMIN_ID);
			preparedStatement.setInt(1, adminid);
			resultSet = preparedStatement.executeQuery();
			
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage() + " : " );
			e.printStackTrace();
		}
		return resultSet;
	}
}
