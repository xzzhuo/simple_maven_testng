package com.maven.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyListener implements ISuiteListener {

	public void onFinish(ISuite suite) {
		System.out.println("++++++++++ Finishing");
	}
	 
	public void onStart(ISuite suite) {
		System.out.println("---------- Starting");
	}

}
