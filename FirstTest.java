package test;

//import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Webdrivermanager
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Kritanjali\\Downloads\\chromedriver\\chromedriver.exe");
		
		 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.google.com");
         //driver.close();
	}
  
}
