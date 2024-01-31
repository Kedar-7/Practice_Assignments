package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Department;
import com.hexaware.mappings.entity.Employee;

public class OneToManyMapping {
	public static void main(String[] args) {

    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction txn = session.beginTransaction();
    	Employee e1 = new Employee(105, "Mayur" ,65000);
    	Employee e2 = new Employee(106, "Satish", 30000);
    	Employee e3 = new Employee(107, "Tushar", 45000);
    	Employee e4 = new Employee(108, "Tejas" ,35000);
    	
//    	Department dept1 = new Department();
//    	dept1.setDepartmentId(10);
//    	dept1.setDepartmentName("Development");
    	
    	Department dept1 = new Department();
    	dept1.setDepartmentId(20);
    	dept1.setDepartmentName("Testing");
    	
    	dept1.addEmployee(e1);
    	dept1.addEmployee(e2);
    	dept1.addEmployee(e3);
    	dept1.addEmployee(e4);

    	session.persist(dept1);
    	
    	txn.commit();
	}
}
