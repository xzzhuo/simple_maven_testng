package com.maven.test;


import org.testng.annotations.Test;

import com.maven.data.StaticProvider;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestNG {
	
	String m_dataSource = null;
	String m_jdbcDriver = null;
	
	public TestNG()
	{
		System.out.println("++++++++++: I'm in testng()");
	}
	
  @Test(groups = { "g1", "list" })
  public void fun1() {
	  System.out.println("XXXXXXXXXX: I'm in fun1()");
  }
  
  @Test(groups = { "g2", "list" })
  public void fun2() {
	  System.out.println("XXXXXXXXXX: I'm in fun2()");
  }
  
  @Test(groups = { "g1" })
  public void fun3() {
	  System.out.println("XXXXXXXXXX: I'm in fun3()");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("XXXXXXXXXX: I'm in beforeMethod()");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("XXXXXXXXXX: I'm in afterMethod()");
  }
  
  @BeforeSuite
  public void beforeSuit() {
	  System.out.println("VVVVVVVVVV: I'm in beforeSuit()");
  }
  
  @AfterSuite
  public void afterSuit() {
	  System.out.println("XXXXXXXXXX: I'm in afterSuit()");
  }

  @Parameters({ "datasource", "jdbcDriver" })
  @BeforeTest
  public void beforeTest(String ds, String driver) {
	  System.out.println("MMMMMMMMMM: I'm in beforeTest()");
	  
	  m_dataSource = ds;                              // look up the value of datasource
	  m_jdbcDriver = driver;
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("XXXXXXXXXX: I'm in afterTest()");
  }
  
  @BeforeGroups
  public void beforeGroups() {
	  System.out.println("XXXXXXXXXX: I'm in beforeGroups()");
  }
  
  @AfterGroups
  public void afterGroups() {
	  System.out.println("XXXXXXXXXX: I'm in afterGroups()");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("XXXXXXXXXX: I'm in beforeClass()");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("XXXXXXXXXX: I'm in afterClass()");
  }
  
	@Parameters({ "first-name" })
	@Test
	public void testSingleString(String firstName) {
		
		System.out.println("m_dataSource =  " + m_dataSource);
		System.out.println("m_jdbcDriver = " + m_jdbcDriver);
		
		assert "Rain".equals(firstName);
	}

	@Parameters({ "db" })
	@Test
	public void testOptionParameter(@Optional("mydb") String db) {
		System.out.println("XXXXXXXXXX: I'm in testOptionParameter()");
		
		System.out.println("database = " + db);
	}
	
	@Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
	public void testDataProvider(Integer a, Integer b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	@DataProvider(name = "dp")
	public Object[][] createData(Method m) {
	  System.out.println(m.getName());  // print test method name
	  return new Object[][] { new Object[] { "DataProvider" }};
	}
	
	@Test(dataProvider = "dp")
	public void testDataProvider1(String s) {
		System.out.println("XXXXXXXXXX: I'm in testDataProvider1()");
	}
	 
	@Test(dataProvider = "dp")
	public void testDataProvider2(String s) {
		System.out.println("XXXXXXXXXX: I'm in testDataProvider2()");
	}
	
	@Test(dependsOnMethods = { "testSingleString" })
	public void testDependsOnMethodsSkip() {
		System.out.println("XXXXXXXXXX: I'm in testDependsOnMethodsSkip()");
	}
	
	@Test(dependsOnMethods = { "testSingleString" }, alwaysRun=true)
	public void testDependsOnMethodsNotSkip() {
		System.out.println("XXXXXXXXXX: I'm in testDependsOnMethodsNotSkip()");
	}
}
