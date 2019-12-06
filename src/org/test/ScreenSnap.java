package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSnap {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.snapdeal.com/");
	dr.manage().window().maximize();
	WebElement wb = dr.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	JavascriptExecutor js = (JavascriptExecutor)dr;
	js.executeScript("arguments[0].setAttribute('value','Hp Labtop')", wb);
WebElement wb1 = dr.findElement(By.xpath("//span[@class='searchTextSpan']"));
wb1.click();
     // js.executeScript("arguments[0].click()", wb1);
TakesScreenshot tk = (TakesScreenshot)dr;
File src = tk.getScreenshotAs(OutputType.FILE);
File desc = new File("D:\\eclipse\\SeleProject\\Screenshot\\Greens1");
FileUtils.copyFile(src, desc);



}
}
