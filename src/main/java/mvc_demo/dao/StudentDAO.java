package mvc_demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import mvc_demo.dto.Student;
@Component
public class StudentDAO {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sigma");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveStudent(Student student) {
		et.begin();
		em.persist(student);
		et.commit();
	}
	public Student getStudent(int id) {
		return em.find(Student.class, id);
	}
	public void updateStudent(Student student) {
		et.begin();
		em.merge(student);
		et.commit();
	}
	public List<Student> getAllStudents(){
		Query query=em.createQuery("select s from Student s");
		List<Student> students=query.getResultList();
		return students;
		
	}
	public void deleteStudent(int id) {
		et.begin();
		em.remove(em.find(Student.class, id));
		et.commit();
		
	}
	 
	
}
