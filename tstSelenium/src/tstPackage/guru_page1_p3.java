package tstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guru_page1_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Cheese!\n"); // send also a "\n"
	    element.submit();

	    // wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

//	    List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
//
//	    // this are all the links you like to visit
//	    for (WebElement webElement : findElements)
//	    {
//	        System.out.println(webElement.getAttribute("href"));
//	    }
	    
	    
	    
	    
//	    To start using the WebDriver API, you must import at least these two packages.
//	    	org.openqa.selenium.*
//	    	org.openqa.selenium.firefox.FirefoxDriver
//	    The get() method is the equivalent of Selenium IDE's "open" command.
//	    Locating elements in WebDriver is done by using the findElement() method.
//	    The following are the available options for locating elements in WebDriver:
//	    	By.className
//	    	By.cssSelector
//	    	By.id
//	    	By.linkText
//	    	By.name
//	    	By.partialLinkText
//	    	By.tagName
//	    	By.xpath
//	    The By.cssSelector() does not support the "contains" feature.
//	    You can instantiate an element using the WebElement class.
//	    Clicking on an element is done by using the click() method.
//	    WebDriver provides these useful get commands:
//	    	get()
//	    	getTitle()
//	    	getPageSource()
//	    	getCurrentUrl()
//	    	getText()
//	    WebDriver provides these useful navigation commands
//	    	navigate().forward()
//	    	navigate().back()
//	    	navigate().to()
//	    	navigate().refresh()
//	    The close() and quit() methods are used to close browser windows. 
//			Close() is used to close a single window; 
//			while quit() is used to close all windows associated to the parent window that the WebDriver object was controlling.

//	    The switchTo().frame() and switchTo().alert() methods are used to direct WebDriver's focus onto a frame or alert, respectively.

//	    Implicit waits are used to set the waiting time throughout the program, while explicit waits are used only on specific portions.

//	    You can use the isEnabled(), isDisplayed(),isSelected(), and a combination of WebDriverWait and ExpectedConditions methods 
//		when verifying the state of an element. However, they do not verify if the element exists.
//	    When isEnabled(), isDisplayed(),or isSelected() was called while the element was not existing, 
//		WebDriver will throw a NoSuchElementException.
//	    When WebDriverWait and ExpectedConditions methods were called while the element was not existing, 
//		WebDriver would throw a TimeoutException. 
	}

}
