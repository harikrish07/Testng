package org.nyk;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BabyPowder extends BaseClassMethods {
	
	public BabyPowder() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Himalaya Baby Powder']")
	private WebElement himalaPowder;
	
	
	public WebElement getHimalaPowder() {
		return himalaPowder;
	}
	
}
