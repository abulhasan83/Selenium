package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIFrame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	dr.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
dr.manage().window().maximize();
    List<WebElement> li = dr.findElements(By.tagName("iframe"));
  System.out.println(li.size());
     WebElement wb = dr.findElement(By.xpath("//iframe[@src='https://infinity.icicibank.com/corp/L001/consumer/Login_Revamp/Login_NLI_Page.html'][1]"));
     dr.switchTo().frame(wb);
      WebElement wb1 = dr.findElement(By.xpath("//input[@class='login-input mode-select-userid']"));
      JavascriptExecutor js = (JavascriptExecutor)dr;
      js.executeScript("arguments[0].setAttribute('value','itabulhasan')", wb1);
      
}
}
