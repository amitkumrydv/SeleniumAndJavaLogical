package com.selenium.logic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		WebElement minimum = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		
		WebElement maximum = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		
		System.out.println("location of minimum "+minimum.getLocation()); //(59, 250)
		System.out.println("Size of minimum "+minimum.getSize());         // (21, 21)
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(minimum, 480, 250).perform();
		
		
		WebElement enterMinimum= driver.findElement(By.xpath("//input[@id='min_price']"));
		
		//enterMinimum.sendKeys("9900");
		
		System.out.println("enterMinimum -->"+enterMinimum.getAttribute("max"));
		
		System.out.println("After drag location of minimum "+minimum.getLocation()); //(59, 250)
		System.out.println("After drag Size of minimum "+minimum.getSize());         // (21, 21)
		
	//	act.dragAndDropBy(maximum, -100, 250).perform(); // perform() internaly call build method so not need to write here
		// act.dragAndDropBy(maximum, -100, 250).build().perform();
		
	}

}
