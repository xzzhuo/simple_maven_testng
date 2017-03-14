package com.maven.data;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class StaticProvider {

	@DataProvider(name = "create")
	public static Object[][] createData() {
		return new Object[][] {
			new Object[] { new Integer(42), new Integer(28) }
		};
	}
	
	@DataProvider(name = "provider1")
	public Iterator<Object[]> createData1() {
	  return null;
	}
}
