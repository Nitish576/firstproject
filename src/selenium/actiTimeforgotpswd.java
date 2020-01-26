package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeforgotpswd {
	static
	{
    System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
       WebElement untxtbx = driver.findElement(By.id("user name"));
       untxtbx.sendKeys("admin");
       WebElement pwtxtbx = driver.findElement(By.id("pwd"));
       pwtxtbx.sendKeys("manager");
       Thread.sleep(3000);
       WebElement forgotlink = driver.findElement(By.linkText("forgot your password?"));
       forgotlink.click();
       driver.close();
}
}