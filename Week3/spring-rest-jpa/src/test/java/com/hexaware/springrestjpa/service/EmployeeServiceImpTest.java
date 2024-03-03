package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;


@SpringBootTest
class EmployeeServiceImpTest {
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpTest.class);
	
	@Autowired
	IEmployeeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddEmployee() {
		EmployeeDTO emp = new EmployeeDTO(122, "Berry", 45000);
		Employee e1 = service.addEmployee(emp);
		logger.info("Employee addded successfully");
		assertNotNull(e1);
		assertEquals(122, e1.getEid());
		assertTrue(e1.getEid()>0);
	}

	
	@Test
	void testUpdateEmployee() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeById() {
		Employee emp=service.getEmployeeById(1);
		assertEquals("Haswanth",emp.getEname());
		
		assertNotEquals("smith", emp.getEname());
	}

	@Test
	void testGetAllEmployee() {
List list = service.getAllEmployee();
		
		boolean flag = list.isEmpty();
		assertFalse(flag);
	}

}
