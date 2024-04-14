package com.selenium.dropdown;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelDropdownCommanMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
	}
		
		public static void commanDropdownMethod (WebElement ele, String value) {
			
			Select eleList = new Select (ele);
			
			List<WebElement> list = eleList.getOptions();
			
			for (WebElement element : list) {
				
				
				if(element.getText().equals(value) ) {
					
					element.click();
					break;
				}
				
				
			}
			
			
			
			
			
			
			
		}

	

}
