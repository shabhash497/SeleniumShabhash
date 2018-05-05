package com.tng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerIInvokedMethod implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("About to begin executing following method :"+ returnMethodName(method.getTestMethod()));
		
	}
	private String returnMethodName(ITestNGMethod method) {
		 
		return method.getRealClass().getSimpleName() + "." + method.getMethodName();
 
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Completed executing following method :"+ returnMethodName(method.getTestMethod()));
		
	}
 
}
