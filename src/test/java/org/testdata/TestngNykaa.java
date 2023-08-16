package org.testdata;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngNykaa extends BaseClassMethods {

	@BeforeTest
	@Parameters({"browserName", "getUrl"})
	private void browserLaunch(String browser, String url) {
		browserLaunch(browser);
		getUrl(url);
		implicitlyWait(10);
	}
	
	@Test (priority = -9)
	private void homePage() {
		WebElement momProduct = driver.findElement(By.xpath("//a[text() = 'mom & baby']"));
		WebElement babyProduct = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
		mouseHoover(momProduct);
		mouseHooverClick(babyProduct);
	}

	@Test
	@Parameters({"pageTitle"})
	private void moveToBabyPowder(String title) {
		
		windowHandles(title);
		WebElement himalayaPowderPage = driver.findElement(By.xpath("//img[@alt='Himalaya Baby Powder']"));
		click(himalayaPowderPage);

	}
	
	@Test(priority = 1)
	@Parameters({"himalayaTitle", "weight"})
	private void addToBag(String title, String kg) {
		
		windowHandles(title);
		WebElement weight = findElement("//select[@title = 'SIZE']");
		dropDown(weight, kg);
		WebElement addTo = findElement("(//span[text() = 'Add to Bag'])[1]");
		click(addTo);
		WebElement bagButton = findElement("//button[@class='css-aesrxy']");
		click(bagButton);
	}
}
