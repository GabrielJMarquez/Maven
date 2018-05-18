package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class TestEx {

	@Test

	public void Browser() {
		System.setProperty("phantomjs.binary.path","/Users/gabriel/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");

		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.google.com");

		String title = driver.getCurrentUrl();
		System.out.println(title);

	}

}
