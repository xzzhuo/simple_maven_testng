package com.maven.listener;

import java.util.List;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

public class AlterSuiteNameListener implements IAlterSuiteListener {

	public void alter(List<XmlSuite> suites) {

		System.out.println("XXXXXXXXXX: I'm in AlterSuiteNameListener.alter()");
		
		XmlSuite suite = suites.get(0);
		
		System.out.println("XmlSuit name : " + suite.getName());
		
        suite.setName(getClass().getSimpleName());
	}

}
