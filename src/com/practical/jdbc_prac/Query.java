package com.practical.jdbc_prac;

public class Query {
	protected static final String INSERT_STUDENT = "INSERT INTO `student` (`student_name`, `student_age`, `student_gender`, `is_deleted`, `student_cls`, `student_sec`) VALUES(?,?,?,'0',?,?);";
	protected static final String SELECT_ALL_STUDENT = "SELECT * FROM student";
	protected static final String SELECT_BY_CLS_SEC = "SELECT * FROM student WHERE student_cls = ? AND student_sec = ?";
	protected static final String SELECT_BY_GEN_AGE = "SELECT * FROM student WHERE student_gender = ? AND student_age = ?";
	protected static final String SELECT_BY_ADMIN_ID = "SELECT * FROM student WHERE admission_no = ?";
			
		
	}
	
		
	

