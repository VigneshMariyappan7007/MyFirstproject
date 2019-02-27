package com.tcs.Testing;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basics05 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JB JK\\\\eclipse-workspace\\\\TestFactory\\\\build\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions acc = new Actions(driver);
		
		Robot r = new Robot();
		
		
		WebElement o = driver.findElement(By.xpath("//input[@id='email']"));
		o.sendKeys("Sansa");
	    String s = o.getAttribute("value");
		System.out.println("UserName :"+ s);
		
		WebElement o1 =driver.findElement(By.xpath("//input[@id='pass']"));
		o1.sendKeys("Stark");
		String s1 = o1.getAttribute("value");
		System.out.println("Password :"+ s1);
		
		
		
		
		WebElement o2 = driver.findElement(By.xpath("//input[@name='firstname']"));
		o2.sendKeys(s);
		String fname = o2.getAttribute("value");
		System.out.println("FirstName :"+ fname);
		
		WebElement o3 = driver.findElement(By.xpath("//input[@name='lastname']"));
		o3.sendKeys(s1);
		String lname = o3.getAttribute("value");
		System.out.println("LastName :"+ lname);
		
		
		
		acc.doubleClick(o2).perform();
		Thread.sleep(2000);
		acc.contextClick(o2).perform();
		
		//COPY FIRSTNAME
		for(int i = 1; i <=8; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement o4 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		o4.click();
		Thread.sleep(2000);
		acc.contextClick(o4).perform();
		Thread.sleep(2000);
		
		//PASTE MAIL
		for (int i = 1; i <= 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//COPY LASTNAME
		o3.click();
		acc.doubleClick(o3).perform();
		Thread.sleep(2000);
		acc.contextClick(o3).perform();
		Thread.sleep(2000);
		
		for(int i = 1; i <= 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//PASTE PASSWORD
		WebElement o5 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		o5.click();
		Thread.sleep(2000);
		acc.contextClick(o5).perform();
		Thread.sleep(2000);
		
	    for (int i = 1; i <= 2; i++) {
					
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
					
		}
	    Thread.sleep(2000);		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

		// DD DAY
		WebElement o6 = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select x = new Select(o6);
	
		List<WebElement> z = x.getOptions();
		
		int i = z.size();
		System.out.println(i);
		
		x.selectByIndex(7);
		
		
		
		
		//DD MONTH
		WebElement o7 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select y = new Select(o7);
		
		List<WebElement> q = y.getOptions();
		
		int j = q.size();
		System.out.println(j);
				
		y.selectByVisibleText("Aug");
		
		
		
		
		
		//DD year
		WebElement o8 = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s7 = new Select(o8);
		
		List<WebElement> p = s7.getOptions();
		
		int k = p.size();
		System.out.println(k);
		
		s7.selectByVisibleText("1993");
		
		//RADIO BUTTON
		WebElement o9 = driver.findElement(By.xpath("//input[@id='u_0_a']"));
		o9.click();
		
		
	

	}

}
