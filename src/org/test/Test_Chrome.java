package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Chrome
{

	public static void main(String[] args) throws InterruptedException
	{
		
		
		//WorkSpace(real entities= TO search automatically chromepath)
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		
		//browserlaunch(key=map==>(chromepath)	
        System.setProperty("webdriver.chrome.driver","E:\\selenium\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("demovishal1234@gmail.com");
		
		
		//Locators
//		("Ctrl+2 release L")==>For Object Creation==>To Get Return Type
//	    driver.findElement(By.id("email"));
//		driver.findElement(By.linkText("https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM1MTU0NTAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login"));
//		driver.findElement(By.cssSelector("#email"));
//		driver.findElement(By.xpath("//input[@name='email']"));
//		driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7']"));

		
		WebElement b =driver.findElement(By.id("pass"));
		b.sendKeys("Vishal@12345");
		
		//WebElement click_login = driver.findElement(By.name("login"))
        //click_login.click();
		
//        WebElement status=driver . findElement(By.xpath(""));
//        status.sendKeys("vishal");
//        WebElement create= driver.findElement(By.id("u_0_2_FU"));
//        create.click();
        Thread.sleep(3000);
        		
        WebElement textbox = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        textbox.click();
        
        Thread.sleep(3000);
        driver.close();
		
	}
}
