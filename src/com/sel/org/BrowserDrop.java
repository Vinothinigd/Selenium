package com.sel.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement multi = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select s = new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s.getOptions();
		for (WebElement opti : options) {
			System.out.println(opti.getText());

		}
		s.selectByVisibleText("Donut");
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			if (i == 0 || i == 2) {
				s.selectByIndex(i);

			}

		}
		System.out.println("------------------");

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement all : allSelectedOptions) {
			System.out.println(all.getText());
		}
		System.out.println("--------------------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		WebElement product = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s1 = new Select(product);
		s1.selectByValue("Google");
		WebElement animals = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select s2 = new Select(animals);
		s2.selectByIndex(0);

	}

}
