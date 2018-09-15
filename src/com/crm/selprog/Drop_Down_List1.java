package com.crm.selprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Thread.sleep(2000);
		
		WebElement iNR = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(iNR);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
			
		}
		
		

	}

}
