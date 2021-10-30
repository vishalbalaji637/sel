package com.discountprice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mythra
{
public static void main(String[] args)throws InterruptedException,IOException,AWTException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	//scrolling option is used
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,250)", "");
	
	WebElement s= driver.findElement(By.xpath("(//img[@class=\\\'image-image undefined image-hand\\\'])[2]"));
	
	s.click();
	/*
	List<WebElement> allPrice=driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	
	for (int i=0;i< allPrice.size();i++ )
	{
		String replaceAll= allPrice .get(i).getText().replaceAll("Rs. ","");
		int parseInt= Integer.parseInt(replaceAll);
		a.add(parseInt);
		
		
	}
	int size= a.size();
	System.out.println("size:"+size);
	
	System.out.println("max price in a list: "+Collections.max(a));
	*/
	driver.close();
}
}
