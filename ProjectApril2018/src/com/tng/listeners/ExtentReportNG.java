package com.tng.listeners;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportNG implements IReporter{
   private ExtentReports extent;
   //providing implementation of IReported method of Interface
   public void generateReport(List<XmlSuite> xmlSuites,List<ISuite> suites,String outputDirectory){
	   extent = new ExtentReports(outputDirectory+File.separator+"Sample.html", false);
	   
	     for(ISuite suite:suites){
	    	 Map<String, ISuiteResult> result = suite.getResults();
	    	 
	    	  for(ISuiteResult r: result.values()){
	    		  ITestContext context = r.getTestContext();
	    		  
	    	  }
	     }
	    extent.flush();
	    extent.close();
   }
   private void buildTestNodes(IResultMap tests,LogStatus status){
	   ExtentTest test;
	    if(tests.size()>0){
	    	for(ITestResult result: tests.getAllResults()){
	    		test= extent.startTest(result.getMethod().getMethodName());
	    		test.setStartedTime(getTime(result.getStartMillis()));
	    		test.setEndedTime(getTime(result.getEndMillis()));
	    		for(String group: result.getMethod().getGroups()){
	    			test.assignCategory(group);
	    		if(result.getThrowable()!=null){
	    			test.log(status, result.getThrowable());
	    		}else{
	    			test.log(status,"Test "+ status.toString().toLowerCase() + "ed");
	    		}
	    	
	    		}
	    	    extent.endTest(test);
	    	}
	    }
   }
	private Date getTime(long mills){
	  Calendar calender = Calendar.getInstance();
	  calender.setTimeInMillis(mills);
		return calender.getTime();
	}
	
}
