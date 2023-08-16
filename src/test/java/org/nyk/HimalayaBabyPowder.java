package org.nyk;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HimalayaBabyPowder extends BaseClassMethods {

	public HimalayaBabyPowder() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@title = 'SIZE']")
	private WebElement weight;

	@FindBy(xpath = "(//span[text() = 'Add to Bag'])[1]")
	private WebElement bag;

	@FindBy(xpath = "//button[@class='css-aesrxy']")
	private WebElement bagButton;

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getBag() {
		return bag;
	}

	public WebElement getBagButton() {
		return bagButton;
	}

}
