package com.sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		WebElement passwrd = driver.findElement(By.name("pass"));
		passwrd.sendKeys("vinu@1995");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log In")).click();
		int size = driver.findElements(By.tagName("input")).size();

		System.out.println(size);
		int size2 = driver.findElements(By.tagName("div")).size();
		System.out.println(size2);

		driver.quit();

	}
}
