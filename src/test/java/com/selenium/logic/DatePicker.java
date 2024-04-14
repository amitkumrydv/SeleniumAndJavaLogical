package com.selenium.logic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		String month= "Jul";
		String year= "2024";
		String day="10";
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		/*
		 * options.addArguments("--disable-extensions"); // Disable extensions
		 * 
		 * 
		 * options.addArguments("--disable-bundled-ppapi-flash"); //
		 * options.addArguments("--disable-plugins-discovery"); //
		 * options.addArguments("--disable-hang-monitor"); //
		 * options.addArguments("--disable-prompt-on-repost"); //
		 * options.addArguments("--enable-experimental-accessibility"); //
		 * options.addArguments("--test-type"); //
		 * options.addArguments("--disable-infobars"); //
		 * options.addArguments("--disable-dev-shm-usage"); //
		 * options.addArguments("--no-sandbox"); //
		 * options.addArguments("--disable-browser-side-navigation"); //
		 * options.addArguments("--disable-gpu"); //
		 * options.addArguments("--disable-software-rasterizer"); //
		 * options.addArguments("--disable-default-apps"); //
		 * options.addArguments("--disable-extensions"); //
		 * options.addArguments("--disable-popup-blocking"); //
		 * options.addArguments("--disable-translate");
		 * options.addArguments("--disable-web-security");
		 * options.addArguments("--ignore-certificate-errors");
		 */
		
		 options.addArguments("--disable-notifications");
		
	WebDriver driver = new ChromeDriver(options);
	
	
	
	
	driver.get("https://www.redbus.in/");
	
	
	driver.manage().window().maximize();
	
	WebElement date = driver.findElement(By.xpath("//span[text()='Date']"));
	
	date.click();

	
	WebElement CaptureDate = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][position()=2]"));
	
	while(true) {
		
              String monthyear= CaptureDate.getText().substring(0, 8);
               
               String arr[] = monthyear.split(" ");
               
               String uimonth = arr[0];
               String uiyear = arr[1];
               
               System.out.println( "uimonth --" + uimonth + " uiyear-- "+uiyear);
               Thread.sleep(2000);
               
               if(uimonth.equalsIgnoreCase(month) && uiyear.equalsIgnoreCase(year) ) {
            	   
            	   System.out.println("break-----");
            	   
            	   break;
            	   
               } else {
            	   
            	   driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
               }
           }
	
	List<WebElement> elementList =driver.findElements(By.xpath("//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']//span//div//span"));
	
	for(WebElement el: elementList) {
		
		String days = el.getText();
		
		if(day.equals(days)) {
			
			el.click();
			break;
		}
	}
	
	
	
	
	}

}
