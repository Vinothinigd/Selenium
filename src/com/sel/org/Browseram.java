package com.sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%2F%3F_encoding%3DUTF8%26k%3Dsign%2520in%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Vinothini");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vinugd");
		driver.findElement(By.xpath("//input[@name='passwordCheck']")).sendKeys("vinugd");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
}
