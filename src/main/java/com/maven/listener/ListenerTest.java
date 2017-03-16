package com.maven.listener;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ MyListener.class, MyMethodInterceptor.class,
	MyHook.class, AlterSuiteNameListener.class,
	DotTestListener.class })
public class ListenerTest {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("VVVVVVVVVV: I'm in ListenerTest.beforeSuit()");
	}
	
	@Test
	public void test() {
		System.out.println("XXXXXXXXXX: I'm in ListenerTest.test()");
	}
	
	@Test
	public void test2() {
		System.out.println("XXXXXXXXXX: I'm in ListenerTest.test2()");
		
		assertEquals("Beust", "Tom");
	}
}
