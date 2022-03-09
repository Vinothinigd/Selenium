package com.sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserscroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.xpath("(//a[@class='nav_a'])[1]"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", findElement);

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[contains(@name,'field')]")).sendKeys("Watch");
		js.executeScript("window.scrollBy(0,-8000)");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].click();", search);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('value','Dress')", search);

	}
}
