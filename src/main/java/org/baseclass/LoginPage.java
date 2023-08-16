package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClassMethods {
		
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement txtUserName;
	
	@FindBy(id = "pass")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement loginButton;
	
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
	
	
	
	
}
