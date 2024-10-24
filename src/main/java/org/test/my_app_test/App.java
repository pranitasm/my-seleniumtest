package org.test.my_app_test;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
import java.io.File;
import java.io.IOException;
import java.time.Duration;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello World!");
    
       // WebDriver driver = new ChromeDriver();
        
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("http://3.15.39.238:8081/contact.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.name("your_name")).sendKeys("Pranita");
        driver .findElement(By.name("phone_number")).sendKeys("999999999");
        driver.findElement(By.name("email_address")).sendKeys("abc@lmn.com");
        driver.findElement(By.name("your_message")).sendKeys("Hello!How are you?");
        driver.findElement(By.id("my-button")).click();
        
//      WebElement textarea = driver .findElement(By.name("my-textarea"));
//      WebElement submitButton = driver.findElement(By.cssSelector("button"));
        		
        		
        //driver.get("https://www.selenium.dev/selenium/web/web-form.html");

       // driver.getTitle();

       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement password = driver .findElement(By.name("my-password"));
//        WebElement textarea = driver .findElement(By.name("my-textarea"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//        Thread.sleep(2000);
//        textBox.sendKeys("Selenium");
//        Thread.sleep(1000);
//        password.sendKeys("Pranita");
//        Thread.sleep(1000);
//        textarea.sendKeys("Hello");
//        Thread.sleep(1000);
//        
//        submitButton.click();
//        Thread.sleep(2000);

        String message = driver.findElement(By.id("response")).getText();
        System.out.println(message);

        //capture screenshot
        
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File srcFile = scrShot. getScreenshotAs (OutputType.FILE);
        File destFile = new File ("test-report.jpg");
        FileUtils.copyFile(srcFile, destFile);
        driver.quit();
    }
}
