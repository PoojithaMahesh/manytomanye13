package manytomanye13.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanye13.dao.CoursseDao;
import manytomanye13.dto.Course;
import manytomanye13.dto.Student;

public class StudentCourseController {

	public static void main(String[] args) {
//		Course  course1=new Course();
//		course1.setId(1);
//		course1.setName("Java");
//		course1.setFees(5000);
//		
//		Course  course2=new Course();
//		course2.setId(2);
//		course2.setName("AdvJava");
//		course2.setFees(6000);
//		
//		Course  course3=new Course();
//		course3.setId(3);
//		course3.setName("Sql");
//		course3.setFees(3000);
//		
//		List<Course> coursesofjohnson=new ArrayList<Course>();
//		coursesofjohnson.add(course1);
//		coursesofjohnson.add(course2);
//		coursesofjohnson.add(course3);
//		
//		List<Course>  coursesofvedang=new ArrayList<Course>();
//		coursesofvedang.add(course1);
//		coursesofvedang.add(course2);
//		
//		Student student1=new Student();
//		student1.setId(1);
//		student1.setName("John");
//		student1.setAddress("Ap");
//		student1.setCourses(coursesofjohnson);
//		
//		Student student2=new Student();
//		student2.setId(2);
//		student2.setName("vedang");
//		student2.setAddress("Delhi");
//		student2.setCourses(coursesofvedang);
//		
//		Student student3=new Student();
//		student3.setId(3);
//		student3.setName("abhishek");
//		student3.setAddress("dubai");
//		
//		student3.setCourses(coursesofjohnson);
//		
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		entityTransaction.begin();
//		
//		entityManager.persist(student1);
//		entityManager.persist(student2);
//		entityManager.persist(student3);
//		entityManager.persist(course1);
//		entityManager.persist(course3);
//		entityManager.persist(course2);
//		
//		entityTransaction.commit();
		
		CoursseDao coursseDao=new CoursseDao();
		coursseDao.deleteCourse(1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
