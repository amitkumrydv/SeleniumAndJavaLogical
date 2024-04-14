package com.selenium.logic;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationPractice {

	public static void main(String[] args) throws MalformedURLException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		URL url = new URL("https://www.google.com/");
		driver.navigate().to(url);
		
		driver.navigate().refresh();
		
		
		//URL url =  'https://www.google.com/';
		
		//driver.get(url);
		
		
		//driver.navigate().to();
		
		
		
		
		

	}

}
