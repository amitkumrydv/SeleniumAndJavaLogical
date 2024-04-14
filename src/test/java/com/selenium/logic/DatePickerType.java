package com.selenium.logic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerType {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		driver.manage().window().maximize();

		WebElement date = driver.findElement(By.xpath("//span//input[@id='dob']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", date);

		Thread.sleep(2000);

		date.click();

		// driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();;

		// List<WebElement> listMonth =
		// driver.findElements(By.xpath("//select[@class='ui-datepicker-year']//option"));

		WebElement listMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		// List<WebElement> listYear =
		// driver.findElements(By.xpath("//select[@class='ui-datepicker-month']//option"));

		Select month = new Select(listMonth);

		Thread.sleep(2000);
		month.selectByVisibleText("Sep");

		// driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();

		WebElement listYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select year = new Select(listYear);

		Thread.sleep(2000);
		year.selectByVisibleText("1999");
		
		
		String day="10";
		
		List<WebElement> daylist= driver.findElements
				(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td[@data-handler=\"selectDay\"]"));
		
		for(WebElement dlist: daylist) {
			
			String dateDay= dlist.getText();
			
			if(dateDay.equals(day)) {
				
				dlist.click();
				System.out.println("Date selected ");
				break;
				
			}
			
			
		}
		
		
		
		

	}

}
