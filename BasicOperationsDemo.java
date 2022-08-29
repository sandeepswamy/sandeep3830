package riddhi;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BasicOperationsDemo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\com.sharnbasvauni.com\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	
	WebElement firstName=driver.findElement(By.id("u_3_b_5n"));
firstName.clear();
firstName.sendKeys("sandeep");

WebElement radioBtn = driver.findElement(By.id("u_2_5_5M"));
if (radioBtn.isDisplayed()&&radioBtn.isEnabled()) {
	radioBtn.click();
}

else {
//	throw Exception
	System.out.println("Radio Button is not Displayed");
	
} 

if (radioBtn.isSelected())
{
	System.out.println("Radio Button is selected");
	
}
else {
	System.out.println("Radio Button is not selected");
}

driver.get("http://www.facebook.com");
WebElement dayDD= driver.findElement(By.id("day"));
String tagName = dayDD.getTagName();
if (tagName.equalsIgnoreCase("Select")) {
	
Select select = new Select(dayDD);
 boolean status=select.isMultiple();
if(status) {
	System.out.println("It is multi select drop down");
}
else {
	System.out.println("It is NOT a multi select selenium");
	
}
select.deselectByIndex(5);
select.deselectByValue("9");
select.deselectByVisibleText("24");
List<WebElement> listDDValues = select.getOptions();
System.out.println("Drop down values are:"+listDDValues);
List<WebElement> listSelectedValues = select.getAllSelectedOptions();
System.out.println("Selected drop down values are:"+listSelectedValues);
WebElement firstElement=select.getFirstSelectedOption();
System.out.println(firstElement);
}
else {
 List<WebElement> listSelectedValues = driver.findElements(By.xpath("//*[@id='day']/option"));
 		System.out.println("Selected drop down values are:"+listSelectedValues);
driver.findElement(By.xpath("//*[@id='day']/option[25]")).click();
 		
 		}

}
}
