package com.seleniumprintscreen.application;

import org.openqa.selenium.WebDriver;

import com.seleniumprintscreen.gmail.example.Gmail;
import com.seleniumprintscreen.utility.DriverSetup;

public class App {
//	public static final String FIREFOX = "FIREFOX";
	public static final String CHROME = "CHROME";
//	public static final String OPERA = "OPERA";


	public static void main(String[] args) {
//		startTesting(FIREFOX);
//		an issue with Chrome browser maximization fixed with new driver version 2.33
		startTesting(CHROME);
//		an issue with opera browser binary 
//		startTesting(OPERA);
	}
	

	private static void startTesting(String browser) {
		DriverSetup driverSetup = new DriverSetup(browser.toLowerCase());
		WebDriver driver = driverSetup.getDriver();
		Gmail.invokeBrowser(driver);
	}

}
