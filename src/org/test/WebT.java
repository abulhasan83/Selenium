package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebT {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/automation-practice-table/");
	dr.manage().window().maximize();
	List<WebElement> trows = dr.findElements(By.tagName("tr"));
	for(int i=trows.size();i>0;i--) {
		WebElement trow = trows.get(i);
		List<WebElement> tds = trow.findElements(By.tagName("td"));
		for(int j=tds.size();j>0;j--) {
			WebElement td = tds.get(j);
			String text = td.getText();
			System.out.println(text);
		}
	}
}
	
		}
