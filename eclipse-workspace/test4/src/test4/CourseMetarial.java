package test4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseMetarial {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("navbtn_references")).click();
    
	try {
	    Thread.sleep(4000); 
	} cath (InterruptedException e) {
	    e.printStackTrace();
	}
    
    driver.findElement(By.id("navbtn_exercises")).click();
    
	try {
	    Thread.sleep(4000); 
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	
    driver.findElement(By.id("navbtn_tutorials")).click();     
    
	try {
	    Thread.sleep(4000); 
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	
	WebElement link = driver.findElement(By.linkText("Learn HTML"));
	link.click(); 
    
	}
	

}
