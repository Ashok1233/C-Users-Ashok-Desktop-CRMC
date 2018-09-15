package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions5 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.geeksforgeeks.org");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[.='Algo ▼']"))).perform();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("Topicwise ►"));
	
		
		

	}

}
