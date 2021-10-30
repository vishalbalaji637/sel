package com.surya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suriya {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// navigate to amazon
		     driver.navigate().to("https://www.amazon.in/");
		// nagivate back to the fb
		driver.navigate().back();
		// nagivate to amazon
		     driver.navigate().forward();
		// and refresh the amazon page
		driver.navigate().refresh();
		// and close the driverchrome page
		driver.close();

	}

}
