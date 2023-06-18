package test3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://profile.w3schools.com/sign-up");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.className("Button_button__URNp+")).click();	
	    
		try {
		    Thread.sleep(4000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		driver.findElement(By.id("modalusername"))
	          .sendKeys("tanima.islam3012@gmail.com");
		
	
	    driver.findElement(By.id("new-password"))
		     .sendKeys("61122481Blue");
	    
	    driver.findElement(By.className("Button_button__URNp+")).click();
	    
		try {
		    Thread.sleep(4000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    driver.findElement(By.id("new-password"))
	     .sendKeys("61122481Blue@");
	    
	    driver.findElement(By.className("Button_button__URNp+")).click();
	    
	    driver.findElement(By.id("modal_first_name"))
	     .sendKeys("Tanima");
	    
	    driver.findElement(By.id("modal_last_name"))
	     .sendKeys("Islam");
	    
	    driver.findElement(By.className("Button_button__URNp+")).click();
	    
	}

}
