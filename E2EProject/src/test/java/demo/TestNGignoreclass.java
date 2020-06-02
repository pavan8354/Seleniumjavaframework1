package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MyRetry;



public class TestNGignoreclass {
	@Test
	public void test1()
	{
		System.out.println("I am inside Test1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside Test2");
		//int i=1/0;
		
	}
	@Test(retryAnalyzer = MyRetry.class)
	public void test3()
	{
		System.out.println("I am inside Test3");
		Assert.fail();
	
		
	}


}









