package com.login.functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(invocationCount=5)
  public void f() {
	  System.out.println("I am test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am AfterTest");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am BeforeTest");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am AfterSuite");
  }

}
