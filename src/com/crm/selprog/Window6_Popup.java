package com.crm.selprog;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window6_Popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='3.13.0']")).click();
	//	try {
	//		Runtime.getRuntime().exec("C:\\Users\\Ashok\\Documents\\AutoIT\\sel1.exe");
	//	}
		////catch(Exception e) {
		//	e.printStackTrace();
	//	}
		
		Robot r=new Robot();
		////r.keyPress(KeyEvent.VK_LEFT);
		//r.keyRelease(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
