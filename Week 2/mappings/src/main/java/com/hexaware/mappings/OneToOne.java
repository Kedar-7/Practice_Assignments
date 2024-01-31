package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToOne 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	
    	Student student = new Student(104, "Amit");
    	//Address address = new Address(25,"Mumbai",student);
    	Address address = new Address();
    	address.setAddressId(26);
    	address.setCity("Chennai");
    	address.setStudent(student);
    	
    	Transaction txn = session.beginTransaction();
    	session.persist(address);
    	txn.commit();
    	
    }
}
