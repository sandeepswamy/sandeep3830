package riddhi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);
	
	driver.get("https://www.jqueryui.com");
	WebElement draggable = driver.findElement(By.linkText("Draggable"));
	draggable.click();
	
	List<WebElement> listFrames = driver.findElements(By.tagName("iframe"));
	System.out.println("Noof frames are:"+listFrames.size());
	
	driver.switchTo().frame(0);	
	
	WebElement draggable1 = driver.findElement(By.id("draggable"));
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(draggable1, 190, 190).build().perform();

	driver.switchTo().defaultContent();	
//			or
//	TargetLocator targetLocator = driver.switchTo();
//	targetLocator.defaultContent();
	
	WebElement droppable = driver.findElement(By.linkText("Droppable"));
	droppable.click();
	
//	driver.switchTo().frame(0);
	WebElement frame = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	
	WebElement draggable123 = driver.findElement(By.id("draggable"));
	WebElement droppable123 = driver.findElement(By.id("droppable"));
	actions.dragAndDrop(draggable123, droppable123).perform();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Resizable")).click();
	
	driver.switchTo().frame(0);
	WebElement draggable12 = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	Actions actions1 = new Actions(driver);
	actions1.dragAndDropBy(draggable12, 100, 100).build().perform();

	
	Thread.sleep(6000);
//	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.get("http://www.flipkart.com");
//	WebElement electronics =  driver.findElement(By.xpath("//div[@class='xtXmba'][text()='Electronics']"));
//	Actions actions =new Actions(driver);
//	
//	actions.moveToElement(electronics).build().perform();
//	driver.get("http://www.google.com");
//	driver.findElement(By.name("q")).sendKeys("rameshsoft");
//	
//	actions.sendKeys(Keys.ENTER).build().perform();
//	
//	WebElement inst = driver.findElement(By.xpath("//h3[contains(text(),'RAMESHSOFT – India')]"));
//	actions.contextClick(inst).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN);
//	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
