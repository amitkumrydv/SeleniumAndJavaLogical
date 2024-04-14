package com.selenium.logic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Data"); // create sheet


		int rowNum = 1;

	

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement link = driver.findElement(By.linkText("Mobiles"));

		link.getAttribute("href");

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		System.out.println("Total links on web page -->>" + linklist.size());

		int linksize = linklist.size();
		int a = 1;
		for (WebElement list : linklist) {

			String listOfLink = list.getAttribute("href");

			System.out.println(a + " Link --" + listOfLink);
			
			
			
			   Row dataRow = sheet.createRow(a);
               Cell dataCell = dataRow.createCell(0);
               dataCell.setCellValue(listOfLink);
			
			a++;

			if (a == linksize) {
				
				System.out.println("Exel file genereted -");

				break;

			}
		}
		
		
		
		
		try {

			FileOutputStream outputStream = new FileOutputStream("data.xlsx");
			workbook.write(outputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
