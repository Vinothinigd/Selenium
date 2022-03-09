package com.sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().refresh();
		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);
		driver.quit();

	}

}
