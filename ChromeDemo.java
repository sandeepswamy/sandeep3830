package riddhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {
public static void main(String[] args) throws InterruptedException {
	
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\geckodriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\msedgedriver.exe");
//	ChromeDriver chrome=new ChromeDriver();
//	FirefoxDriver fire =new FirefoxDriver();
//	EdgeDriver driver=new EdgeDriver();
	RemoteWebDriver driver= new EdgeDriver();
//	WebDriver driver =new FirefoxDriver();	
	driver.manage().deleteAllCookies();
	driver.get("http://www.gmail.com");
	
//	WebElement sam=driver.findElement(By.id("identifierId"));
//	sam.sendKeys("sandeep.07rec@gmail.com");
//	
//	WebElement sam1=driver.findElement(By.id("identifierNext"));
//	sam1.click();
//	
//	WebElement sam=driver.findElement(By.ById.id("identifierId"));
//	sam.sendKeys("sandeep.07rec");
	
//	WebElement sam1=driver.findElement(By.ById.id("identifierNext"));
//	sam1.click();
	
//WebElement sam2=driver.findElementById("identifierId");
//	sam2.sendKeys("sandeep.07rec");
//	
//	WebElement sam11=driver.findElementById("identifierNext");
//	sam11.click();
WebElement account= driver.findElement(By.xpath("//*[text()='Create account']"));
account.click();


	Thread. sleep(20000);
	driver.close();
	
}

}
