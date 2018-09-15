package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window7_Popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seller.flipkart.com/");
		driver.findElement(By.xpath("//a[.='Forgot password?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("emailId")).sendKeys("madineni.ashok90@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[.='Submit'])[1]")).click();
		Thread.sleep(1000);
		WebElement eleclose = driver.findElement(By.xpath("(//span[.='×'])[1]"));
		eleclose.click();
		String text = eleclose.getText();
		System.out.println(text);
		driver.close();
		
		

	}

}
