package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Unicreds {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Soft Stuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://unicreds.com/contact-us");
	    Thread.sleep(2000);
	    
	    WebElement FullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
	    Thread.sleep(2000);
	    FullName.sendKeys("Vikrant Suresh Jedhe");    
	    System.out.println("CP1");
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
	    Thread.sleep(2000);
	    Email.sendKeys("vikrantjedhe5@gmail.com");    
	    System.out.println("CP2");
	    
	    WebElement Phone=driver.findElement(By.xpath("//input[@placeholder='Phone']"));
	    Thread.sleep(2000);
	    Phone.sendKeys("8459941821");    
	    System.out.println("CP3");
	    
	    WebElement Message=driver.findElement(By.xpath("//textarea[@placeholder='Message']"));
	    Thread.sleep(2000);
	    Message.sendKeys("Happy");    
	    System.out.println("CP4");
	    
	    WebElement Submit=driver.findElement(By.xpath("//button[@id='contactButton']"));
	    Thread.sleep(2000);
	    Submit.click();  
	    System.out.println("CP5");
	    System.out.println("Message sent successfully");
	    
	    Unicreds obj= new Unicreds();
	    obj.Screenshot(driver, "Unicred Page1");
	    System.out.println("Screenshot Captured Successfully");
	    
	    System.out.println("Form is Working Properly");  
	    Thread.sleep(2000);
	    
	    WebElement Close=driver.findElement(By.xpath("//span[@aria-hidden='true']"));
	    Thread.sleep(2000);
	    Close.click();  
	    System.out.println("CP6");
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	}
	
	public void Screenshot(WebDriver driver, String Name) throws IOException
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("F:\\New sc\\"+Name+".jpg");
		FileHandler.copy(source, dest);
	}
	
	


}
