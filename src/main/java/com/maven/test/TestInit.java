package com.maven.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.testng.IAnnotationTransformer;
import org.testng.IConfigurationListener2;
import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestInit implements IAnnotationTransformer, IInvokedMethodListener,
ITestListener, ISuiteListener, IExecutionListener, IMethodInterceptor, IConfigurationListener2 {

	public void onConfigurationSuccess(ITestResult itr) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onConfigurationSuccess()");
	}

	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onConfigurationFailure()");
	}

	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onConfigurationSkip()");
	}

	public void beforeConfiguration(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in beforeConfiguration()");
	}

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("++++++++++: I'm in intercept()");
		
		return null;
	}

	public void onExecutionStart() {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onExecutionStart()");
	}

	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onExecutionFinish()");
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onStart()");
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onFinish()");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onTestStart()");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onTestSuccess()");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onTestFailure()");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onTestSkipped()");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onTestFailedButWithinSuccessPercentage()");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onStart()");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in onFinish()");
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in beforeInvocation()");
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in afterInvocation()");
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++: I'm in transform()");
	}
	
}
