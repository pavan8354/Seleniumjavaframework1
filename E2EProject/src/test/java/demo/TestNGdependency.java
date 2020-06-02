package demo;

import org.testng.annotations.Test;


@Test(groups= {"All class Tests packages"})
public class TestNGdependency {

	@Test(dependsOnGroups= {"sanity1"})

	public void Test1() {

		System.out.println("I am inside test1");

	}
	@Test(groups="sanity1")

	public void Test2() {

		System.out.println("I am inside test2");	
	}
	@Test()

	public void Test3() {

		System.out.println("I am inside test3");
	}

	




}









