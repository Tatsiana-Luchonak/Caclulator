package com.calculator.testing;

import com.calculator.Calculator;
import org.testng.annotations.*;


@Listeners(OurListener.class)
public class BaseTest {
	protected Calculator calculator;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("----------- Before method -----------");
		calculator = new Calculator();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("----------- After method -----------");
	}


	@BeforeClass
	public void beforeClass() {
		System.out.println("----------- Before class -----------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("----------- After class -----------");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("----------- Before test -----------");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("----------- After test -----------");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("----------- Before suite -----------");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("----------- After suite -----------");
	}

	@BeforeGroups
	public void beforeGroup() {
		System.out.println("----------- Before group -----------");
	}

	@AfterGroups
	public void afterGroup() {
		System.out.println("----------- After group -----------");
	}
}
