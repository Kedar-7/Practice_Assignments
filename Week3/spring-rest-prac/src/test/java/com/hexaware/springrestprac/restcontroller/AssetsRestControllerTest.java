package com.hexaware.springrestprac.restcontroller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import jakarta.validation.constraints.AssertFalse.List;

@SpringBootTest
class AssetsRestControllerTest {
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testGetAll() {
//		ResponseEntity<Assets> response = restTemplate.getForEntity("http://localhost:8080/api/assets/getall",List.class);
				

	}

	@Test
	void testInsertAssets() {
	}

	@Test
	void testGetAssetById() {
	}

	@Test
	void testDeleteAssetById() {
	}

}
