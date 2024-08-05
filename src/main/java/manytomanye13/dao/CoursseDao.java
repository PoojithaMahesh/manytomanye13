package manytomanye13.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanye13.dto.Course;
import manytomanye13.dto.Student;

public class CoursseDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void updateCourse(int courseId,Course  course) {
		EntityManager entityManager=getEntityManager();
		Course dbCourse=entityManager.find(Course.class, courseId);
		if(dbCourse!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			course.setId(courseId);
			entityManager.merge(course);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	public void findCourse(int courseId) {
		EntityManager entityManager=getEntityManager();
		Course dbCourse=entityManager.find(Course.class, courseId);
		if(dbCourse!=null) {
			System.out.println(dbCourse);
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	public void deleteCourse(int courseId) {
		EntityManager entityManager=getEntityManager();
		Course dbCourse=entityManager.find(Course.class, courseId);
		if(dbCourse!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbCourse);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
}
