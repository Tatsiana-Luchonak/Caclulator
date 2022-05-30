package com.calculator.testing;

import com.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSum extends BaseTest{

	@Test(groups = "Sum")
	public void simpleTest() {
		System.out.println("Simple sum test execution ...");
		Assert.assertEquals(calculator.sum(1, 1), 2);
	}

	@Test(enabled = false)
	public void ignoredTest() {
		System.out.println("Simple ignored test execution ...");
		Assert.assertEquals(calculator.sum(2, 2), 4);
	}

	@Test(invocationCount = 2)
	public void invocationCount() {
		System.out.println("This tests should be executed twice");
		Assert.assertEquals(calculator.sum(2, 2), 4);
	}

	@Test(invocationCount = 2, threadPoolSize = 2)
	public void invocationCountTwoThreads() {
		System.out.println("This tests should be executed twice in 2 threads");
		Assert.assertEquals(calculator.sum(2, 2), 4);
	}

	@Test(invocationCount = 3, skipFailedInvocations = true)
	public void failedTest() {
		System.out.println("2 of 3 invocations should be skipped");
		Assert.assertEquals(calculator.sum(1, 1), 3);
	}

	@Test(timeOut = 5000)
	public void sleepTest() throws InterruptedException {
		System.out.println("Sleep tests, I should be failed ...");
		Thread.sleep(5000);
		Assert.assertEquals(calculator.sum(2, 2), 4);
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void expectedException() {
		System.out.println("Wait for Null Pointer");
		Calculator calc  = null;
		calc.sum(1, 1);
	}
}
