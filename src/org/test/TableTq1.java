package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTq1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/automation-practice-table/");
	dr.manage().window().maximize();
	List<WebElement> trows = dr.findElements(By.tagName("tr"));
	for(int i=0;i<trows.size()-2;i++) {
		WebElement trow = trows.get(i);
		List<WebElement> tdata = trow.findElements(By.tagName("td"));
		for(int j=0;j<tdata.size();j++) {
			WebElement td = tdata.get(j);
			String text = td.getText();
			System.out.println(text);
			
		}
		
	}
	WebElement tr = dr.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[4]/td[1]"));
	WebElement td = tr.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[4]/td[5]"));
	String rank = td.getText();
	System.out.println(rank);
}
}
