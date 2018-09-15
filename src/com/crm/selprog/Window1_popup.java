package com.crm.selprog;
// fileuploading script for gmail

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("identifier")).sendKeys("madineni.ashok90@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("9738635151");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(18000);
		driver.findElement(By.xpath("//div[.='COMPOSE']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.name("to")).sendKeys("madineni.ashok90@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.name("subjectbox")).sendKeys("Hi Ashok..");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		 Thread.sleep(1000);
		 
			 try {
				Runtime.getRuntime().exec("C:\\Users\\Ashok\\Documents\\AutoIT\\Open1.exe");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[.='Send']")).click();
			 Thread.sleep(2000);
		 

	}

}
