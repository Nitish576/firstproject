package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

   public class Releasedate {
	 static
     {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	  }
	 public static void main(String[] args) throws InterruptedException {

    	
	 WebDriver driver = new  ChromeDriver();
	 driver.get("https://selenium.dev/downloads/");
	 WebElement elel=driver.findElement(By.xpath("//td[.='Ruby']/../td[3]"));
	 Thread.sleep(1000);
	 System.out.println(elel.getText());
	 driver.close();
	   
	}

}
