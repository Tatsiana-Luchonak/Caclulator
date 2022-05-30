package com.calculator.testing;

import org.apache.commons.lang3.RandomUtils;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDivision extends BaseTest{
	@Test
	@Parameters({"a", "b", "expectedResult"})
	public void simpleTest(@Optional("5") int a,
						   @Optional("1") int b,
						   @Optional("5") int expectedResult) {
		System.out.println("Division");
		Assert.assertEquals(calculator.division(a, b), expectedResult);
	}

	@Test(timeOut = 4000, retryAnalyzer = Retry.class)
	public void withRetry() throws InterruptedException {
		long timeout = RandomUtils.nextLong(3500, 4500);
		System.out.println("Retry..." +  timeout);
		Thread.sleep(timeout);
		Assert.assertEquals( calculator.division(10, 2), 5);
	}
}
