package com.maven.listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ MyListener.class, MyMethodInterceptor.class })
public class ListenerTest {

	@Test
	public void test() {
		System.out.println("XXXXXXXXXX: I'm in test()");
	}
}
