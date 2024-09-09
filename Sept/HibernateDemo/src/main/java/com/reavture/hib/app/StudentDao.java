package com.reavture.hib.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.revature.hib.model.Student;
public class StudentDao {
	
	public void saveStudent(Student s)
	{
		
	Transaction transaction=null;
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		transaction=session.beginTransaction();
		session.save(s);
		transaction.rollback();
		
	}
	catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}
public List < Student > getStudents() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        return session.createQuery("from Student", Student.class).list();
    }
}
}


