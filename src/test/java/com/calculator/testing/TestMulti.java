package com.calculator.testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMulti extends BaseTest{

	@DataProvider(name = "Input data")
	public Object[][] input() {
		return new Object[][] {
				{5, 1, 5},
				{5, 2, 10},
				{5, 3, 15},
				{5, 4, 20},
				{5, 5, 25},
		};
	}

	@Test(dataProvider = "Input data")
	public void simpleTest(int a, int b, int expectedResult) {
		System.out.println(" Multiply test#" + b);
		Assert.assertEquals(calculator.multiply(a, b), expectedResult);
	}
}
