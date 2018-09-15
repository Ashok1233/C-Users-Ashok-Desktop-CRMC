package com.crm.selprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		WebElement fDay = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		Select sel=new Select(fDay);
		List<WebElement> allOptions = sel.getOptions();
		int size1 = allOptions.size();
	
		System.out.println(size1);
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
			
			}
	Thread.sleep(2000);
	driver.close();
		
		
	
	

	}

}
