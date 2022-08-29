package riddhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MicroSoftEdge {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

driver.get("http://www.instagram.com");

WebElement userName= driver.findElement(By.className("_2hvTZ pexuQ zyHYP"));
	userName.click();
	userName.sendKeys("Sandeep");
	
Thread.sleep(5000);
driver.close();
	
	
}
}
