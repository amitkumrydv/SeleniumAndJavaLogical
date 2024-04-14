package com.selenium.logic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriver driver = YourDriverInitializationMethod(); // Initialize your WebDriver instance

        // FluentWait with a maximum timeout of 30 seconds and polling every 2 seconds
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(org.openqa.selenium.NoSuchElementException.class);

        // Example: Wait until an element is visible and then perform some action
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
        element.click();

        // Close the WebDriver instance
        driver.quit();
    }

    // Method to initialize and return WebDriver instance (replace this with your actual method)
    private static WebDriver YourDriverInitializationMethod() {
        // Initialize and return WebDriver instance (e.g., ChromeDriver, FirefoxDriver, etc.)
        return null; // Replace this line with your actual WebDriver initialization code
    }
}
