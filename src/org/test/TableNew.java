package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableNew {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/automation-practice-table/");
	dr.manage().window().maximize();
	List<WebElement> theads = dr.findElements(By.tagName("th"));
	
	/*for(int i=0;i<theads.size();i++) {
		WebElement head = theads.get(i);
		String txt = head.getText();
		System.out.println(txt);
	}*/
	
	List<WebElement> trows = dr.findElements(By.tagName("tr"));
	for(int i=0;i<trows.size();i++)
	{
		if(i==5) {
	        WebElement tr2 = trows.get(i);
	      List<WebElement> tds = tr2.findElements(By.tagName("td"));
	     for(int j=0;j<tds.size();j++) {
	    	 if(j==4) {
	    	 WebElement td = tds.get(j);
	    	 String t = td.getText();
	    	 System.out.println(t);
	    	 }
	     }
		}
	
	
	
	
	
	/*for(int i=0;i<theads.size();i++) {
		WebElement th = theads.get(i);
			String tx = th.getText();
			System.out.println(tx);*/
		
	}

	
	
}
}
