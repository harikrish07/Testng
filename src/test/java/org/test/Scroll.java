package org.test;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scroll extends BaseClassMethods {

		public static void main(String[] args) {
			
			browserLaunch("chrome");
			getUrl("https://www.limeroad.com/");
			findElement("//span[text()='SHOP MEN']").click();
			implicitlyWait(15);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollTo(0,900);");
			
			
		}
	
}
