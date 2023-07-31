package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotPage {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		takescreenshot("Google_Homepage");
		
		driver.close();
	}
	
	
	public static void takescreenshot(String fileName) throws IOException {
		
		//1. take screenshot and store it as file format.
		//
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. now copy the screen shot to desired location using copyfile method:
	FileUtils.copyFile(file, new File("C:\\Rashmi\\EclipseProjects\\ProjectA\\src\\main\\java\\com\\screenshot\\"+fileName+".jpg"));
	}
	
}
