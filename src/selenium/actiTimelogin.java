package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimelogin {
	static
	{
    System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
       WebElement untxtbx = driver.findElement(By.id("username"));
       untxtbx.sendKeys("admin");
       WebElement pwtxtbx = driver.findElement(By.name("pwd"));
       pwtxtbx.sendKeys("manager");
      driver.findElement(By.xpath("//div[.='Login']")).click();
	

	}

}
