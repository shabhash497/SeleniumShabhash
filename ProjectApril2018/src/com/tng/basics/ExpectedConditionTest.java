package com.tng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedConditionTest {

	@Test(expectedExceptions=NumberFormatException.class)
	public void conversion(){
		String str= "100A";
		Integer.parseInt(str);
		Assert.assertEquals("shabhash", "shabhash","Message validation");
	}
}
