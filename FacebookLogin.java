package riddhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLogin {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("sandeep.07rec@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("sandeep12345");
	driver.findElement(By.name("login")).click();
//	driver.findElement(By.linkText("https://scontent.fblr4-1.fna.fbcdn.net/v/t39.30808-1/297586399_5237956502983598_5661953816783963586_n.jpg?stp=cp0_dst-jpg_p40x40&_nc_cat=109&ccb=1-7&_nc_sid=7206a8&_nc_ohc=R7lX7bzQU-AAX-2bZyC&_nc_ht=scontent.fblr4-1.fna&oh=00_AT_iUSYkfywBXa06cw8hM-tCvMsPxNMBjNmXZ8ZbvjUJPA&oe=630711F8")).click();
//	Actions actions = new Actions(driver);
//	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click();
//	
}
}
