package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Signup / Login")).click();

        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("test@example.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");

        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        driver.quit();
    }
}
