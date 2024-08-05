package manytomanye13.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanye13.dto.Student;

public class StudentDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void updateStudent(int studentId,Student student) {
		EntityManager entityManager=getEntityManager();
		Student dbStudent=entityManager.find(Student.class, studentId);
		if(dbStudent!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			student.setId(studentId);
			student.setCourses(dbStudent.getCourses());
			entityManager.merge(student);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	public void findStudent(int studentId) {
		EntityManager entityManager=getEntityManager();
		Student dbStudent=entityManager.find(Student.class, studentId);
		if(dbStudent!=null) {
			System.out.println(dbStudent);
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	public void deleteStudent(int studentId) {
		EntityManager entityManager=getEntityManager();
		Student dbStudent=entityManager.find(Student.class, studentId);
		if(dbStudent!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbStudent);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	
	
	
	
	}
