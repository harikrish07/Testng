package org.nykaa;
import java.util.List;
import org.baseclass.BaseClassMethods;
import org.openqa.selenium.WebElement;
public class TestBaseClass extends BaseClassMethods {
	public static void main(String[] args) {
		browserLaunch("chrome");
		// browserClosing("close");
		getUrl("https://www.amazon.in/");
		List<WebElement> elements = findElements("//div[@id='nav-xshop']");
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			System.out.println("**********************");
			if (webElement.getText().contains("Mobiles")) {
				WebElement mobiles = findElement("//a[text()='Mobiles']");
				click(mobiles);
			}
		}
		List<WebElement> category = findElements("//div[@id='s-refinements']");
		for (WebElement categories : category) {
			System.out.println(categories.getText());
			System.out.println("***********************");
			if (categories.getText().contains("OnePlus")) {
				WebElement oneplus = findElement("//span[text()='OnePlus']");
				click(oneplus);
			}
		}
		List<WebElement> listOfMobiles = findElements("//span[@class='a-size-base-plus a-color-base a-text-normal']");
		System.out.println("List Of Mobiles");
		for (WebElement mobilesText : listOfMobiles) {
			System.out.println(mobilesText.getText());
		}
	}
}
