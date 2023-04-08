package org.kkk;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.nio.AsyncServerRequestHandler;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Urllaunch {
	static WebDriver driver;
	@BeforeClass
	public static void test() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(opt);
	driver.get("https://www.facebook.com/");	
	}
	@Before
	public void test4() throws IOException {
		TakesScreenshot scr =(TakesScreenshot) driver;
		File file2 = scr.getScreenshotAs(OutputType.FILE);
		System.out.println(file2);
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\AnytimePractise\\screenshot\\krish.png");
		FileUtils.copyFile(file2, file);
		
	}
		
	@Test
	public void test3() {

	WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect' )]"));
		String text2 = text.getText();
		System.out.println(text2);
		assertEquals("Facebook helps you connect and share with the people in your life.", text2);
		driver.findElement(By.id("email")).sendKeys("krish");
	driver.findElement(By.id("pass")).sendKeys("80980");
		driver.findElement(By.name("login")).click();
	}
	@After
public void test9() throws IOException {
	TakesScreenshot screen =(TakesScreenshot) driver;
	File file3= screen.getScreenshotAs(OutputType.FILE);
	System.out.println(file3);
	File file8 =new File("C:\\Users\\ADMIN\\eclipse-workspace\\AnytimePractise\\screenshot\\kk.png");
	FileUtils.copyFile(file3, file8);
	
}

	
	
}


