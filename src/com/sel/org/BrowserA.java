package com.sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserA {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805955&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9040218%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAjoeRBhAJEiwAYY3nDA24gKA3xlAV8tjlVrusRbl6sBHWbtkBW8iBQUYnDXptUfhqV3JTbxoCIm8QAvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vinothini");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Dhanasekar");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9597875989");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinukalyani");
		driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("29");
		driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("may");
		driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1995");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

	}
}
