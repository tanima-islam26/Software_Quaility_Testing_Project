package qwr;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class practice{
	
   public static void main(String[] args) {
     
	  System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      //URL launch
      driver.get("https://www.amazon.com/");
      //identify menu
      WebElement n=driver.findElement(By.id("nav-link-accountList"));
      // object of Actions with method moveToElement
      Actions a = new Actions(driver);
      a.moveToElement(n).perform();
      //identify sub-menu element
      WebElement m=driver.
      findElement(By.xpath("//*[text()='Create a List']"));
      //move to element and click
      a.moveToElement(m).click().perform();
      System.out.println("Page navigated to: " +driver.getTitle());
      //driver.quit();
   }
}