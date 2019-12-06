package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWeb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> trows = dr.findElements(By.tagName("tr"));
	for(int i=trows.size()-1;i>0;i--) {
		WebElement trow = trows.get(i);
		List<WebElement> tdata = trow.findElements(By.tagName("td"));
		for(int j=tdata.size()-1;j>0;j--) {
			WebElement tdatum = tdata.get(j);
			String text = tdatum.getText();
			if(text.equals("Dubai"))
			{
			System.out.println(text);
		}
	}
	
}
}
}
