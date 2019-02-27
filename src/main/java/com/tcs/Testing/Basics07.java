package com.tcs.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics07 {
	
	public static void main(String [] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\JB JK\\\\\\\\eclipse-workspace\\\\\\\\TestFactory\\\\\\\\build\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Actions acc = new Actions(driver);
		
		WebElement obj = driver.findElement(By.xpath("//input[@name='username']"));
		obj.click();
		
		acc.contextClick(obj).perform();
		
		
		
	}

}
