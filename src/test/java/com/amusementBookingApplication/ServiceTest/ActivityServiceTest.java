package com.amusementBookingApplication.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amusementBookingApplication.Entity.Activity;
import com.amusementBookingApplication.Service.ActivityService;

@SpringBootTest
public class ActivityServiceTest {

	@Autowired
	ActivityService activityService;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}
	
	
	@Test
	void addActivityTest()  {
		Activity ac = new Activity();
		ac.setDescription("clown ");
		ac.setCharges(356);	
		Activity addAct = activityService.addActivity(ac);
		assertEquals("Water Slide",addAct.getDescription());
		assertEquals(356,addAct.getCharges());
		
	}

}
