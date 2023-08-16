package org.test;

import java.io.IOException;

import org.baseclass.BaseClassMethods;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Pathology extends BaseClassMethods {

	public static void main(String[] args) throws IOException {
		browserLaunch("chrome");
		getUrl("https://gor-pathology.web.app/dashboard");
		WebElement email = findElement("//input[@name = 'email']");
		enterText(email, "test@kennect.io");
		WebElement password = findElement("//input[@name = 'password']");
		enterText(password, "Qwerty@1234");
		WebElement button = findElement("//span[text() = 'Login']");
		click(button);
		implicitlyWait(10);
		WebElement testPateient = findElement("//input[@id = 'patient-test']");
		click(testPateient);
		WebElement vitamin = findElement("//div[text() = 'AFP (ALPHA FETO PROTEINS)']");
		explicitWait(vitamin);
		click(vitamin);
		implicitlyWait(20);
		WebElement percentage = findElement("//em[text() = 'None']");
		click(percentage);
		WebElement percentCount = findElement("//li[text() = '10%']");
		click(percentCount);
		screenshot();
	}

}
