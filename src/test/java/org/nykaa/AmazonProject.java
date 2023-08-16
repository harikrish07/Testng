package org.nykaa;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProject extends BaseClassMethods {

	public static void main(String[] args) throws AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://amazon.in/");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	String attribute = element.getAttribute("href");
	System.out.println(attribute);
	
	System.out.println(getAttribute(element, "href"));
	
	
		
	}
	
}
