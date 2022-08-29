package riddhi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker;

public class ActionsDemo {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("http://www.gmail.com");
//	using JavascriptExecutor
	
//	driver.navigate().to("http://www.gmail.com");
//	URL url = new URL("http://www.gmail.com");
//	driver.navigate().to(url);
	
	WebElement userName = driver.findElement(By.id("identifierId"));
	
//	userName.clear();
//	userName.sendKeys("sandeep");
	
//	using JavascriptExecutor: we perform datatyping actions
	
//	using actions class
	Actions actions = new Actions(driver);
//	actions.sendKeys(userName, "sandeep").build().perform();
	actions.click(userName).sendKeys("sandeep.07rec").build().perform();
	WebElement next=driver.findElement(By.id("identifierNext"));
	next.click();
	
	actions.click(next).build().perform();
	actions.doubleClick().build().perform();
	actions.sendKeys(next, Keys.ENTER).build().perform();
	
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_DOWN).build().perform();
	
	actions.sendKeys(Keys.chord(Keys.CONTROL),"t").build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL),"a").build().perform();
	
	
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"t").build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"s").build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();
	
}
}
