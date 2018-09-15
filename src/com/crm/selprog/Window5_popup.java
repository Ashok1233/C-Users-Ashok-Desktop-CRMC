package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window5_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("madineni.ashok90@gmail.com");
		//driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("9738635151");
		//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		

	}

}
