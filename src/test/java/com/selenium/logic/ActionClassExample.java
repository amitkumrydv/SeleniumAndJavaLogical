package com.selenium.logic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open the website
        driver.get("https://www.example.com");

        // Create an instance of Actions class
        Actions actions = new Actions(driver);
        
   

        // Example actions: Move to element, click, and perform keyboard input
        WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
        
        // Move to the input field
        actions.moveToElement(element).perform();
        
        // Click on the input field
        actions.click().perform();
        
        // Type something into the input field
        actions.sendKeys("YourUsername").perform();
        
        
        actions.contextClick();

        // Perform another action, like clicking on a button
        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        actions.moveToElement(button).click().perform();

        // Close the browser
        driver.quit();
    }
}
