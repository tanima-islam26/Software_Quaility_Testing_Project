package test5;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class search {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("search2"))
	          .sendKeys("Python Tutorial");
		
		try {
		    Thread.sleep(2000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		driver.findElement(By.id("learntocode_searchicon")).click();

		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.id("search2"))
        .sendKeys("JavaScript");
		
		try {
		    Thread.sleep(2000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	
		driver.findElement(By.id("learntocode_searchicon")).click();
	    
	}
}
