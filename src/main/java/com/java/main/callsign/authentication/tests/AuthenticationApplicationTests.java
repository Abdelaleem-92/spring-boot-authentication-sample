package com.java.main.callsign.authentication.tests;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.main.callsign.authentication.controller.Main_controller;




@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthenticationApplicationTests {

	@Autowired
	private Main_controller MainController;
	
	   @Test
	   public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
	      //Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");
	      //String testName = orderService.getProductName();
		   String res = MainController.helloWorld("Call Sign");
		   System.out.println(res);
	      String testName = "";
	      Assert.assertEquals("Mock Product Name", testName);
	   }
	
	
}
