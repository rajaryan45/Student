package com.practical.jdbc_prac;

public class Query {
	protected static final String INSERT_STUDENT = "INSERT INTO `student` (`student_name`, `student_age`, `student_gender`, `is_deleted`, `student_cls`, `student_sec`) VALUES(?,?,?,'0',?,?);";
}
