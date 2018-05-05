package com.tng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerITest implements ITestListener {

@Override
public void onTestStart(ITestResult result) {
	System.out.println("About to begin executing Test "+result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println(result.getName()+" Test executed successfully");
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("The name of the testcase failed is :"+result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("The name of the testcase Skipped is :"+result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext result) {
	System.out.println("The execution of the main test starts now");
	
}

@Override
public void onFinish(ITestContext result) {
	System.out.println("The execution of the main test ends now");
	
}
}
