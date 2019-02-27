package com.tcs.Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics06 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\JB JK\\\\\\\\eclipse-workspace\\\\\\\\TestFactory\\\\\\\\build\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/login?lang=en");
		
		Actions acc = new Actions(driver);
		
		WebElement obj = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[2]"));
		obj.sendKeys("12345");
		
		acc.doubleClick(obj).perform();
		acc.contextClick(obj).perform();
		
		Robot r = new Robot();
		
		for(int i = 1; i <= 2; i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		}
		

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement obj1 = driver.findElement(By.xpath("(//input[@name='session[password]'])[2]"));
		obj1.click();
		
		acc.contextClick(obj1).perform();
		
		for(int i = 1; i<=2; i++) {
			
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		}

		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String s = obj1.getAttribute("value");
		System.out.println(s);
		
				

	}

}
