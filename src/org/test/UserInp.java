package org.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInp {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String s1 = s.next();
	WebDriver dr = null;
	if(s1.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleProject\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
	}
	else if(s1.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\SeleProject\\Drivers\\geckodriver.exe");
		dr=new FirefoxDriver();
	}
	else if(s1.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", "D:\\eclipse\\SeleProject\\Drivers\\IEDriverServer.exe");
	}
	else
		System.out.println("Invalid browser");
}
}
