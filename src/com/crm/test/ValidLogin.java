package com.crm.test;

import org.testng.annotations.Test;

import com.crm.generic.BaseTest;
import com.crm.generic.Excel;
import com.crm.page.EnterPage;
import com.crm.page.LoginPage;

public class ValidLogin extends BaseTest{
	@Test(priority=1,groups= {"login","smoke"})
	public void testValidLogin() throws InterruptedException {
		String un=Excel.getValue(XL_PATH,"ValidLogin",1,0);
		String pw=Excel.getValue(XL_PATH, "ValidLogin",1,1);
		String eTitle=Excel.getValue(XL_PATH,"ValidLogin",1,2);
		LoginPage l=new LoginPage(driver);
		//Enter Valid UN
		l.setUserName(un);
		//Enter Valid pw
		Thread.sleep(3000);
		l.setPassword(pw);
		//Click login
		Thread.sleep(3000);
		l.clickLogin();
		//verify home page....
		//EnterPage e=new EnterPage(driver);
		//e.verifyHomePageIsDisplayed(driver, eTitle);
	}

}
