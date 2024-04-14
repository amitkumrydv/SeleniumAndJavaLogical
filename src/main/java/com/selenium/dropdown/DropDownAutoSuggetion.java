package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutoSuggetion {

public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-web-security");
		option.addArguments("--ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(option);
		
		
		
//  WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		wait.until(ExpectedCondition.);
		
		
		driver.get("https://www.twoplugs.com");
		
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath(" //button[@class='btn green']")).click();
		
		WebElement searchbox=driver.findElement(By.xpath(" //input[@id='autocomplete']"));
		
		searchbox.clear();
		
		searchbox.sendKeys("Toronto");
		
		
		String text;
		
		do {
			
			searchbox.sendKeys(Keys.ARROW_DOWN);
			
			
			text=searchbox.getAttribute("value");
			
			if(text.equals("Toronto Street, Ottawa, ON, CanadaXj")) {
				
				searchbox.sendKeys(Keys.ENTER);
			}
		}
		
		while(!text.isEmpty()) ;
		

	}

}
