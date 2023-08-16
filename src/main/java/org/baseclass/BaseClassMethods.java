package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.io.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassMethods {
	public static WebDriver driver;

	// 1. Browser Launch
	public static void browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	// 2 and 3. Browser close and quit
	public static void browserClosing(String value) {
		if (value.equalsIgnoreCase("close")) {
			driver.close();
		} else if (value.equalsIgnoreCase("quit")) {
			driver.quit();
		}
	}

	// 4. get URL
	public static void getUrl(String url) {
		driver.get(url);
	}

	// 5. FindElements
	public static List<WebElement> findElements(String xpath) {
		return driver.findElements(By.xpath(xpath));
	}

	// 6. FindElement
	public static WebElement findElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	// 7. Click
	public static void click(WebElement value) {
		value.click();
	}

	// 8. Wait
	// 8.1 thread.sleep
	public static void waitThread(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// 8.2 implicitlyWait
	public static void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}

	// 8.3 explicitlyWait
	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// 9.Actions move to webElement
	public static void mouseHoover(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	// 9.1 Actions MoveToWebElement and Click
	public static void mouseHooverClick(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).click().perform();
	}

	// 10. Navigate
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// 11. NavigateBack
	public static void navigateBack() {
		driver.navigate().back();
	}

	// 12. Navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// 13. Navigate forward
	public static void navigateforward() {
		driver.navigate().forward();
	}

	// 14. WindowHandles
	public static Set<String> windowHandles(String title) {
		Set<String> handles = driver.getWindowHandles();
		for (String str : handles) {
			if (driver.switchTo().window(str).getTitle().contains(title)) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		return handles;
	}

	// 15. Drop down
	public static void dropDown(WebElement value, String text) {
		Select src = new Select(value);
		click(value);
		src.selectByVisibleText(text);
	}

	// 16. Frame
	public static void switchToFrame(WebElement target) {
		driver.switchTo().frame(target);
	}

	public static void switchToDefaultPage() {
		driver.switchTo().defaultContent();
	}

	// 17. TakeScreenshot
	public static void screenshot() throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File pic = screenShot.getScreenshotAs(OutputType.FILE);
		Random rand = new Random(System.currentTimeMillis());
		int num = rand.nextInt(100);
		File loc = new File("C:\\Users\\Harish\\eclipse-workspace\\NykaaMaster\\driver\\screenshot\\" + num + ".png");
		FileHandler.copy(pic, loc);
	}

	// 18. getCurrentUrl
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	// 19. getTitle
	public static String getTitle() {
		return driver.getTitle();
	}

	// 20. getText
	public static String getText(WebElement text) {
		return text.getText();
	}

	// 21. sendKeys
	public static void enterText(WebElement text, String value) {
		text.sendKeys(value);
	}

	// 22. isDisplayed
	public static boolean isDisplayed(WebElement target) {
		return target.isDisplayed();
	}

	// 23. isEnabled
	public static boolean isEnabled(WebElement target) {
		return target.isEnabled();
	}

	// 24. isSelected
	public static boolean isSelected(WebElement target) {
		return target.isSelected();
	}

	// 25. Robot
	public static Robot robot() throws AWTException {
		Robot r1 = new Robot();
		return r1;
	}

	// 26. getAttribute
	public static String getAttribute(WebElement attribute, String href) {
		return attribute.getAttribute(href);
	}

	// 27. scrollDown and scrollUp
	public static void scroll(String value, int x) {
		if (value.equalsIgnoreCase("down")) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + x + ")");
		} else if (value.equalsIgnoreCase("up")) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + x + ")");
		}
	}

	// 28. alert
	public static Alert alert() {
		return driver.switchTo().alert();
	}

	// 29. isMultiple
	public static boolean isMultiple(WebElement element) {
		Select s1 = new Select(element);
		return s1.isMultiple();
	}

	// 30. getoptions
	public static List<WebElement> getoptions(WebElement element) {
		Select s1 = new Select(element);
		return s1.getOptions();
	}

	// 31. getfirstSelectOptions
	public static WebElement getFirstSelectedOptions(WebElement element) {
		Select s1 = new Select(element);
		return s1.getFirstSelectedOption();
	}

	// 32. getAllSelectedOptions
	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		Select s1 = new Select(element);
		return s1.getAllSelectedOptions();
	}
}
