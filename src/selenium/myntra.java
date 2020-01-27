package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {
static
{
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");

}
	
 public static void main(String[] args) throws InterruptedException {
    	  
WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.myntra.com/");
	Thread.sleep(3000);
		
	 WebElement ele = driver.findElement(By.xpath("//a[.='men']"));
 		 
     Actions act = new Actions(driver);
 		 
 	 act.moveToElement(ele).perform();
 	 Thread.sleep(3000);
 	 
 	 List<WebElement> SubMenus =driver.findElements(By.xpath("//a[@class=desktop-category"));
 	 
 	 for(WebElement e : SubMenus)
 	 
 	 {
		if(e.isDisplayed());
		
 		 {
 			
 			 System.out.println(e.getText());
 		 }
 			 
 		 	 driver.close();

 		 }
 			
 	 }
 }

 			 
