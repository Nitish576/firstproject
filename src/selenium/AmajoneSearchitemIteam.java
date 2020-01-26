package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmajoneSearchitemIteam {
static{
 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
}
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 
	 String Title = driver.getTitle();
	 System.out.println(Title);
	 
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
	 
	 WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 search1.sendKeys("vivo");
	 
	 WebElement Search2 = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
	 Search2 .click();
	 
      Thread.sleep(6000);
      
	 driver.close();
	 
 }
}

