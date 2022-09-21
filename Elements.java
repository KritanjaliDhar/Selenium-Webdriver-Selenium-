package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");
        
        //By Name
        //driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
        //WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("ABCD", Keys.ENTER);
        
        driver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]")); 
         
        for(WebElement element :options) {
        	System.out.print(element.getText());
        }
        //by id
        driver.findElement(By.id("fname")).sendKeys("Kritanjali");
        //by cssSelector
        driver.findElement(By.cssSelector("#lname")).sendKeys("Dhar");
        //Linktext
        //driver.findElement(By.linkText("here")).click();
       
        
        //BY RelativeLocators
        //WebElement Textbox = driver.findElement(By.name("message"));
        //driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(Textbox)).sendKeys("Kritanjali");
        
        Thread.sleep(2000);
        driver.close();
        driver.quit(); 
		
	}

}
