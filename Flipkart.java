package org.mob;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	public void mobileFone() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Msi\\eclipse-workspace\\ModelProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement x = driver.findElement(By.xpath("//button[text()='✕']"));
		x.click();
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("redmi mobiles", Keys.ENTER);
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement simple = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		Select s = new Select(simple);
		s.selectByValue("10000");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'SPICE')]")).click();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
		String text = price.getText();
		int value = Integer.parseInt(text);
		if(value>10000) {
			System.out.println("Price is less than 10,000");
		}
		else {
			System.out.println("Price is above 10,000");
		}
		
			
			
	}
		
	

	public static void main(String[]args) throws Exception {
		Flipkart f = new Flipkart();
		f.mobileFone();
	}
}