package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenD7 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://www.greenstechnologys.com/");
	dr.manage().window().maximize();
	TakesScreenshot tk = (TakesScreenshot)dr;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File desc  = new File("D:\\eclipse\\SeleProject\\Screenshot\\screend7.png");
	FileUtils.copyFile(src, desc);
	
}
}
