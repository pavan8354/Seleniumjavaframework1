package demo;

import org.testng.annotations.Test;


@Test(groups= {"All class Tests"})
public class TestNGgroupsdemo {


	@Test(groups= {"Sanity"})

	public void test1() {

		System.out.println("This is test1>>>>>>!!!!");



	}
	@Test(groups= {"windows.Regression"})
	public void test2() {

		System.out.println("This is test2>>>>>>!!!!");



	}
	@Test(groups= {"linux.Regression"})
	public void test3() {

		System.out.println("This is test3>>>>>>!!!!");



	}

	public void test4() {

		System.out.println("This is test4>>>>>>!!!!");


	}


}









