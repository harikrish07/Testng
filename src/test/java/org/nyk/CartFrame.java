package org.nyk;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartFrame extends BaseClassMethods{
	
	public CartFrame() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//iframe[@class = 'css-acpm4k']")
	private WebElement frame;
	
	@FindBy(xpath = "(//span[@class='css-1aowomc ehes2bo0'])[1]")
	private WebElement quantity;
	
	@FindBy(xpath = "(//div[@value ='3'])[2]")
	private WebElement quantitySize;
	
	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceedButton;

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getQuantitySize() {
		return quantitySize;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public WebElement getFrame() {
		return frame;
	}
	

}
