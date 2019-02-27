package com.tcs.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class basics03 {
	
public static void main(String[] args) throws InterruptedException {
	
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JB JK\\eclipse-workspace\\TestFactory\\build\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions acc = new Actions(driver);
		
		WebElement obj = driver.findElement(By.xpath("//h1[contains(text(),'Selenium Drag and Drop Example:')]"));
		
		acc.contextClick(obj).perform();
		String s = obj.getText();
		System.out.println(s);
		
		Thread.sleep(2000);
		
		WebElement obj1 = driver.findElement(By.xpath("//h2[contains(text(),'Drag the following blocks into empty cells below')]"));
		
		acc.contextClick().perform();
		String s1 = obj1.getTagName();
		System.out.println(s1);
		
		WebElement obj2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement obj3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		acc.dragAndDrop(obj2, obj3).perform();
		System.out.println("Drag and Drop completed");
		
		
		
		
		






}

}
