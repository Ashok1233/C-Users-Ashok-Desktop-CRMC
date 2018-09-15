package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		driver.findElement(By.id("uploadBtnCont")).click();
		try {
			//the Runtime object associated with the current Java application.
			Runtime.getRuntime().exec("C:\\Users\\Ashok\\Documents\\AutoIT\\cv.exe");
		}
		catch(Exception e) {
			
		}
		

	}

}
