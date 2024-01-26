package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		 String query="insert into student (id,name,city) value(?,?,?)";
		 int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		// updating data
		String query="update student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentid) {
		// Delete Operation
		String query="Delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentid);
		return r;
	}
	public Student getStudent(int studentid) {
		// Select sing student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentid);
		return student;
	}
	public List<Student> getAllStudents() {
		// Select multiple Student
		String query="Select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	}
	


