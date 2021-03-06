package com.tcs.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics01 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JB JK\\eclipse-workspace\\TestFactory\\build\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions acc = new Actions(driver);
		
		WebElement obj = driver.findElement(By.xpath("//input[@id='email']"));
		obj.sendKeys("12345");
		
		String s = obj.getAttribute("value");
		System.out.println(s);
		
		WebElement obj1 = driver.findElement(By.xpath("//input[@id='pass']"));
		obj1.sendKeys("123");
		
		WebElement obj2 = driver.findElement(By.xpath("//span[contains(text()'Create')"));
		
		String s1 = obj2.getText();
		System.out.println(s1);
		
		
		
	}
	
	

}
