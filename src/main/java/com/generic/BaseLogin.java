package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	public void getLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_v98.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@class='login']")).click();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		
	}
	
	public static void main(String[] args) {
		
		BaseLogin obj = new BaseLogin();
		obj.getLogin();
		
	}

}
