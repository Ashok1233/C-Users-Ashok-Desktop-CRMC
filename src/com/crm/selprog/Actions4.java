package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[.='Men']"))).perform();
		WebElement subMenu = driver.findElement(By.xpath("//a[.='Formal Shoes']"));
		subMenu.click();
		WebElement formalShoe = driver.findElement(By.xpath("//img[contains(@alt,'Red Tape Men Black Formal Derbys')]"));
		formalShoe.click();
		
		/*JavascriptExecutor j=((JavascriptExecutor)driver);
		WebElement size = driver.findElement(By.xpath("//p[.='8']"));
		int y = size.getLocation().getY();
        j.executeScript("window.scrollTo(0,'"+y+"')");
        Thread.sleep(2000);*/
        
		WebElement shoeSize = driver.findElement(By.xpath("//p[.='8']"));
		shoeSize.click();
		WebElement addtoCart = driver.findElement(By.xpath("//button[.='ADD TO CART']"));
		addtoCart.click();
		Thread.sleep(2000);
		WebElement gotoCart = driver.findElement(By.xpath("//span[.='GO TO CART']"));
		gotoCart.click();
		WebElement placeOrder = driver.findElement(By.xpath("//button[.='PLACE ORDER']"));
		placeOrder.click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("madineni.ashok90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9738635151");
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		

	}

}
