package com.readExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestLogin {

   @Test(invocationCount = 10)
   public void loginTest() {  
           // System Property for Chrome Driver   
    	   System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
          
             // Instantiate a ChromeDriver class.     
           WebDriver driver=new ChromeDriver();  
          
           // Launch Web site  
           driver.navigate().to("https://www.ups.com/us/en/Home.page");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          driver.findElement(By.xpath("(//*[text()='Log in / Sign up'])[2]")).click();
          driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
          driver.findElement(By.id("pwd")).sendKeys("SAYEDawan2008");
          driver.findElement(By.id("submitBtn")).click();
          
          String text = driver.findElement(By.id("ups-account-toggle")).getText();
          System.out.println("Application logger name : "+ text);
          
          driver.quit();
          
          
          
          
}
}