package tstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru_page1_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        
        tagName = driver.findElement(By.id("month")).getTagName();
        System.out.println(tagName);
        
        driver.close();

	}
	
	
	//Variation	Description	Sample
	//By.className		finds elements based on the value of the "class" attribute	findElement(By.className("someClassName"))
	//By.cssSelector	finds elements based on the driver's underlying CSS Selector engine	findElement(By.cssSelector("input#email"))
	//By.id				locates elements by the value of their "id" attribute	findElement(By.id("someId"))  
	//By.linkText		finds a link element by the exact text it displays	findElement(By.linkText("REGISTRATION"))  
	//By.name			locates elements by the value of the "name" attribute	findElement(By.name("someName"))  
	//By.partialLinkText	locates elements that contain the given link text	findElement(By.partialLinkText("REG"))  
	//By.tagName		locates elements by their tag name	findElement(By.tagName("div"))  
	//By.xpath			locates elements via XPath	findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/ tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/ form/table/tbody/tr[5]"))

}
