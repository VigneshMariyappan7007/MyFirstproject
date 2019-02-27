package com.tcs.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics02 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JB JK\\eclipse-workspace\\TestFactory\\build\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions acc = new Actions(driver);
		
		WebElement obj = driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
		acc.moveToElement(obj).perform();
		
		WebElement obj1 = driver.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"));
		acc.moveToElement(obj1).perform();
		
		WebElement obj2 = driver.findElement(By.xpath("//span[contains(text(),'Cases & Covers')]"));
		acc.moveToElement(obj2).click().perform();
		
	}

}
