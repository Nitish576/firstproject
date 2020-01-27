package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveraction {

	static {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");

	}
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
 		 WebElement MenMenu = driver.findElement(By.xpath("//a[@href='/shop/men']"));
 		 
 		 Thread.sleep(4000);
 		 
 		 Actions act = new Actions(driver);
 		 
 		 act.moveToElement(MenMenu).perform();
	}

}
