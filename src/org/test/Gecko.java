package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\SeleProject\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.get("https://www.facebook.com/");
	driver.get("https://www.amazon.in");
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
}
}
