package com.inetbanking.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObject.loginPage;

public class TC_LoginTest_001  extends BaseClass

{

	@Test
public void logintest() throws IOException
{
			driver.get(baseURL);
			logger.info("URL is opened");
			loginPage lp = new loginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePag"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else 
		{
			captureScreenshot(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("Login Test Fail");
		}			

}
}
	
	
	
