package com.tcs.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics04 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JB JK\\\\eclipse-workspace\\\\TestFactory\\\\build\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions acc = new Actions(driver);
		
		WebElement obj = driver.findElement(By.xpath("//input[@id='email']"));
		
		acc.keyUp(obj, Keys.SHIFT).sendKeys(obj, "cvbn").perform();

		
		
/*		
		WebElement obj1 = driver.findElement(By.xpath("//input[@id='pass']"));
		obj1.sendKeys("kholi");
		
		String s1 = obj1.getAttribute("value");
		System.out.println(s1);
		
		acc.contextClick(obj1).perform();
		System.out.println("context clicked");
		
*/		
		

	}

}
