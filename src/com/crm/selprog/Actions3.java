package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[@href='/contactus']")).click();
		Thread.sleep(1000);
		driver.close();
		

	}

}
