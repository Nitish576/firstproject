package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
static {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");

	}
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Nitish%20kumar/Downloads/Selenium%20Example/DoubleClick.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//button[.='Double-click me']"));
		
		Actions act = new Actions(driver);
		
	     act.doubleClick(rightclick).perform();
	     
	     Thread.sleep(4000);

	}

}
