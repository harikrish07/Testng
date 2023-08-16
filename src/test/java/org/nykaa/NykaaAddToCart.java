package org.nykaa;

import java.io.IOException;
import java.util.Set;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;

public class NykaaAddToCart extends BaseClassMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		browserLaunch("chrome");
		getUrl("https://www.nykaa.com/");
		implicitlyWait(10);
		WebElement momProduct = findElement("//a[text() = 'mom & baby']");
		WebElement powderProduct = findElement("//a[text()='Baby Powder']");
		mouseHoover(momProduct);
		mouseHooverClick(powderProduct);
		String str = "Shop For The Best Baby Powder";
		windowHandles(str);
		WebElement himalayaPowder = findElement("//img[@alt='Himalaya Baby Powder']");
		click(himalayaPowder);
		String s1 = "Himalaya Baby Powder: Buy";
		windowHandles(s1);
		WebElement weight = findElement("//select[@title = 'SIZE']");
		dropDown(weight, "200g");
		WebElement bag = findElement("(//span[text() = 'Add to Bag'])[1]");
		click(bag);
		WebElement bagButton = findElement("//button[@class='css-aesrxy']");
		click(bagButton);
		waitThread(3000);
		WebElement frame = findElement("//iframe[@class = 'css-acpm4k']");
		switchToFrame(frame);
		WebElement quantity = findElement("(//span[@class='css-1aowomc ehes2bo0'])[1]");
		click(quantity);
		WebElement quantitySize = findElement("(//div[@value ='3'])[2]");
		click(quantitySize);
		WebElement proceedButton = findElement("//span[text()='Proceed']");
		click(proceedButton);
		switchToDefaultPage();
		waitThread(3000);
		WebElement bagCheckOut = findElement("//p[text() = 'Bag']");
		click(bagCheckOut);
		WebElement editBagCheckOut = findElement("//p[text()='Edit']");
		click(editBagCheckOut);
		implicitlyWait(5);
		WebElement removeCart = findElement("//div[@data-test-id = 'product-remove']");
		click(removeCart);
		implicitlyWait(10);
		screenshot();
		WebElement deleteButton = findElement("//button[text()='Yes']");
		click(deleteButton);
	}
}
