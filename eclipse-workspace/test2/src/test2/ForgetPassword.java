package test2;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ForgetPassword {	
	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://profile.w3schools.com/");
	driver.manage().window().maximize();	
	WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
	String linkUrl = forgotPasswordLink.getAttribute("href");
	driver.get(linkUrl);
	}
}
