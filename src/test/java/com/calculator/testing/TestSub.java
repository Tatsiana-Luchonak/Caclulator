package com.calculator.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSub extends BaseTest{

	@Test
	public void priority(){
		System.out.println("I am ????");
		Assert.assertEquals(calculator.subtraction(5, 2), 3);
	}

	@Test(priority = 3)
	public void priority3(){
		System.out.println("I am 3rd");
		Assert.assertEquals(calculator.subtraction(5, 2), 3);
	}

	@Test(priority = 2)
	public void priority2(){
		System.out.println("I am 2d ");
		Assert.assertEquals(calculator.subtraction(5, 2), 3);
	}

	@Test(priority = 1)
	public void priority1(){
		System.out.println("I am 1st");
		Assert.assertEquals(calculator.subtraction(5, 2), 3);
	}

	@Test(dependsOnMethods = "priority2", priority = 0)
	public void dependOn(){
		System.out.println("I am dependOn priority2");
		Assert.assertEquals(calculator.subtraction(5, 2), 3);
	}
}
