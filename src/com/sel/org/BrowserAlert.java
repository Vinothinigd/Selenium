package com.sel.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert.click();
		Thread.sleep(3000);
		WebElement abutton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		abutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(@class,'btn')])[3]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		text.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.sendKeys("vinu");
		Thread.sleep(3000);
		alert2.accept();
		driver.quit();

	}

}
