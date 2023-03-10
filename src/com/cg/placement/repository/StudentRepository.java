package com.cg.placement.repository;
import com.cg.placement.entity.Student;

public interface StudentRepository {

	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public Student deleteStudent(Student student);
	
	public Student addCertificate(Student student);
	public Student updateCertificate(Student student);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void deleteStudent(int id);
	
}
