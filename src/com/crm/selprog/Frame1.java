package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame(0);
		JavascriptExecutor j=((JavascriptExecutor)driver);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//strong[.='Partial Link Test']"));
		int y = ele.getLocation().getY();
		String scroolto="window.scrollTo(0,'"+y+"')";
		j.executeScript(scroolto);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[.='Partial Link Test']")).click();
		
		

	}

}
