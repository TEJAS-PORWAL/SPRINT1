package com.cg.placement.client;
import com.cg.placement.entity.Student;
import com.cg.placement.service.StudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		// Creating an object of all entity files
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		student.setId(3);
		student.setName("aryan");
		student.setCollege("Dr Ambedkar Institute of technology");
		student.setRoll(210);
		student.setQualification("CSE");
		student.setCourse("B.Tech");
		student.setYear(2023);
		student.setCertificate("Degree Completed");
		student.setHallticketno(210);
		
		service.addStudent(student);
		
		System.out.println("one student entry entry is completed");
		
		
	}

}
