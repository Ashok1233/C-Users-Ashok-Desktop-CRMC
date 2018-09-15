package com.crm.selprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement pretty= driver.findElement(By.id("u_0_n"));
		int y=pretty.getLocation().getY();
		JavascriptExecutor j=((JavascriptExecutor)driver);
		Thread.sleep(1000);
		
		String scrollpage = "window.scrollTo(0,'"+y+"')";
		j.executeScript(scrollpage);
		//driver.close();

	}

}
