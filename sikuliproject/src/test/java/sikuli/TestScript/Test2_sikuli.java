package sikuli.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test2_sikuli {
  @Test
  public void handlingflipkart() throws InterruptedException, FindFailed {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//implementing sikuli
		Screen s = new Screen();
		Thread.sleep(5000);
		
		//click on fashion
		//s.hover("C:\\Automation\\sikuliproject\\sikuliLocator\\clickfashion.PNG");
		s.hover("C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\clickfashion.PNG");
		Thread.sleep(5000);
		
		//search smartphone
		//s.type("C:\\Automation\\sikuliproject\\sikuliLocator\\typesearch.PNG", "SmartPhone");
		s.type("C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\typesearch.PNG", "SmartPhone");
		Thread.sleep(5000);
		
		driver.close();
		
	
	  
  }
}
