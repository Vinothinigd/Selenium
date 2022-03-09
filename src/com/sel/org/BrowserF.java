package com.sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserF {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

	}

}
