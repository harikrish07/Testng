package org.nyk;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseClassMethods {

	public Cart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text() = 'Bag']")
	private WebElement bagAtCheckout;

	@FindBy(xpath = "//p[text()='Edit']")
	private WebElement editBagAtCheckout;

	@FindBy(xpath = "//div[@data-test-id = 'product-remove']")
	private WebElement removeCartItem;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement deleteButton;

	public WebElement getBagAtCheckout() {
		return bagAtCheckout;
	}

	public WebElement getEditBagAtCheckout() {
		return editBagAtCheckout;
	}

	public WebElement getRemoveCartItem() {
		return removeCartItem;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

}
