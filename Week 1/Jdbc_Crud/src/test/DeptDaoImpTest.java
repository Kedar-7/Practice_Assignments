package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Dept;

class DeptDaoImpTest {
	
	static IDeptDao dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = new DeptDaoImp();
	}

	@Test
	@Disabled
	void testInsert() {
		Dept dept = new Dept();
		dept.setDno(110);
		dept.setDname("Charity");
		dept.setLocation("Chennai");
		
		int actual = dao.insert(dept);
		assertEquals(1, actual);
	}

	@Test
	void testSelectAll() {
		List<Dept> list = dao.selectAll();
		Dept dept = list.get(0);
		assertTrue(dept.getDno() > 0);

	}

}
