package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("my program is started..............");
		// spring jdbc=jdbc Template
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		// JdbcTemplate tm = context.getBean("JdbcTemplate",JdbcTemplate.class);

		// insert quary
		// String quary="insert into student (id,name,city) value(?,?,?)";
		// fire quary
		// int result = tm.update(quary,522,"Ram","Rampur");
		// System.out.println("Number of record inserted...."+result);
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
		// Student student=new Student();
		// student.setId(230);
		// student.setName("Rushi");
		// student.setCity("Mumbai");
	//	 int result = studentDao.insert(student);
	//	 System.out.println("Student Added...."+ result);

		Student student = new Student();
		student.setId(522);
		student.setName("priya");
		student.setCity("Nagar");
		int result = studentDao.change(student);
		System.out.println("Student updated..." + result);
		
	//	int result = studentDao.delete(786);
	//	System.out.println("deleted...."+result);
		
	//	Student student = studentDao.getStudent(222);
      //    System.out.println(student);
	//	List<Student> Students = studentDao.getAllStudents();
	//	for(Student s:Students)
	//	{
	//		System.out.println(s);
	//	}
	}
}
