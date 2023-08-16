package org.nyk;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClassMethods {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() = 'mom & baby']")
	private WebElement momProduct;
	
	@FindBy(xpath = "//a[text()='Baby Powder']")
	private WebElement powderProduct;

	public WebElement getMomProduct() {
		return momProduct;
	}

	public WebElement getPowderProduct() {
		return powderProduct;
	}
}
