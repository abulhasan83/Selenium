package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHand {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.snapdeal.com/");
	dr.manage().window().maximize();
	WebElement wb = dr.findElement(By.id("inputValEnter"));
	wb.sendKeys("vivo v15");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement wb1 = dr.findElement(By.xpath("//span[@display-price='21990']"));
	wb1.click();
	String par = dr.getWindowHandle();
	System.out.println(par);
	Set<String> all= dr.getWindowHandles();
	System.out.println(all);
	for(String x:all) {
	if(!par.equals(x)) {
		dr.switchTo().window(x);
	}
	    
}
	    WebElement wb3 = dr.findElement(By.xpath("//div[@id='add-cart-button-id']"));
	    wb3.click();
	  w  Thread.sleep(4000);
	    WebElement hc = dr.findElement(By.xpath("//i[@class='customerCareIcon footerIconsImg']"));
		   hc.click();
	    dr.switchTo().defaultContent();
	    Set<String> allnew = dr.getWindowHandles();
	    List<String>l1=new ArrayList<>();
	    l1.addAll(allnew);
	    System.out.println(l1);
	    dr.switchTo().window(l1.get(2));
	   
	    WebElement wb4 = dr.findElement(By.xpath("//div[@class='col-xs-24 login_message']"));
	    String text = wb4.getAttribute("class");
	    System.out.println(text);
}
}
