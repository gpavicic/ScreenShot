package com.seleniumprintscreen.gmail.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.seleniumprintscreen.utility.TakeScreenShot;

public class Gmail {
	private static final Logger LOG = LoggerFactory.getLogger(Gmail.class);

	public static final String APP_LINK = "https://www.gmail.com/";

	WebDriver driver;

	public static void invokeBrowser(WebDriver driver) {
		try {
			LOG.info(" |INFO| Launching Gmail test scenario.");
			// Target web-page
			driver.get(APP_LINK);

			// Test scenario: take screen shot after entering User name for gmail account
			
			driver.findElement(By.id("identifierId")).sendKeys("test.user");
			TakeScreenShot.ScreenShot(driver, "EnterUserName");

		} catch (Exception e) {
			LOG.error("|ERROR| Launching Gmail test scenario.");
			e.printStackTrace();
		}}}
	
