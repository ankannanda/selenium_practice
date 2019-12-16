package tstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru_page1_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
        //System.exit(0);
	}

}
