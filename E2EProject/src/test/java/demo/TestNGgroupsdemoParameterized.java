package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGgroupsdemoParameterized {
	
	@Test
	@Parameters({"MyName"})
	public void TestDemo(String name) {
		
		System.out.println("Name is......." +name);
		
		
		
	}


	

}









