package com.qa.Seleniumscripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class SetIUpCheck {

	public static WebDriver driver;
	@Test
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/ ");
		 driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		// Thread.sleep(1000);
		 Actions action = new Actions(driver);
		WebElement element =driver.findElement(By.linkText("Electronics"));
		Thread.sleep(5000);
		
		action.moveToElement(element).build().perform();
		
		WebElement element2 = driver.findElement(By.className("_3704LK"));
		action.moveToElement(element2);
		
		action.click().build().perform();
		
		
		 	action.sendKeys((" MI")).build().perform();
		 	
		 	action.click().build().perform();
		 	
		 	driver.findElement(By.className("eFQ30H")).click();
		
		
	//	System.out.println(driver.getTitle());
		
		//Thread.sleep(5000);
		
		//driver.close();
		

	}

}
