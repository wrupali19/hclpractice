package sikuli.TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.sikuli.script.*;

public class Test1_sikuliFUp {
  @Test
  public void fileUpload() throws InterruptedException, FindFailed {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//TC2- Go to test url https://www.saucedemo.com/
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//implementing sikuli
		Screen s = new Screen();
		
		//click on choose file button
		s.click("C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\clickchoosefile.PNG");
		Thread.sleep(4000);
		
		//to send path into textbox
		Pattern fileinputtextbox = new Pattern("C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\take_filename.PNG");
		Thread.sleep(4000);
		
		//send data into the path textbox
		s.type(fileinputtextbox, "C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\Data.docx");
		Thread.sleep(4000);
		
		//click on open button
		s.click("C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\click_openbutton.PNG");
		Thread.sleep(12000);
		
		//lick on download button
		s.click("C:\\Users\\Lenovo\\Automation\\sikuliproject\\sikuliLocator\\click_download.PNG");
		Thread.sleep(6000);
		
		//close the browser
		driver.close();
		
		
		
		
		
		
  }
}
