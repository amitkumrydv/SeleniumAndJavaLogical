package com.selenium.logic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropdown {

public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		selectChoiceValue(driver, "choice 1");
		
		
	}

public static void selectChoiceValue(WebDriver driver, String... value) {
	
	List<WebElement> choiceList = driver.findElements(By.xpath("//ul//span[@class='comboTreeItemTitle']"));
	
	System.out.println(choiceList);
	
	if(!value[0].equalsIgnoreCase("all")) {
		
		for(WebElement listElement : choiceList) {
			
			String text =listElement.getText();
			
			
			for(String valuList :value) {
				
				if(text.equals(valuList)) {
					
					listElement.click();
					break;
				}
			}
			
			
			
		}
		
	}else {
		
		for(WebElement item: choiceList) {
			
			item.click();
		}
	}
	
}

	

}
