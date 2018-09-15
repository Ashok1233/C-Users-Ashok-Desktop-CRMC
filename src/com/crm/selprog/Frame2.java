package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ashok/Documents/page1.html");
		driver.navigate().refresh();
		driver.switchTo().frame(0);
		//Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	
		driver.findElement(By.tagName("input")).sendKeys("Ashok");
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
