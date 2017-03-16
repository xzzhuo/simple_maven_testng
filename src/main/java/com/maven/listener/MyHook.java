package com.maven.listener;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class MyHook implements IHookable {

	public void run(IHookCallBack callBack, ITestResult testResult) {
		
		System.out.println("XXXXXXXXXX: I'm in MyHook.run()");
		
		System.out.println("ITestResult name : " + testResult.getName());
		
		// TODO Auto-generated method stub

		// Preferably initialized in a @Configuration method
		
		/*
	    mySubject = authenticateWithJAAs();
	    
	    Subject.doAs(mySubject, new PrivilegedExceptionAction() {
	    	public Object run() {
	    		icb.callback(testResult);
	    	}
	    };
	    */
	}

}
