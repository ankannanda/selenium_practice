package tstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.ca");
		
		driver.manage().window().maximize();
		
	}

}
