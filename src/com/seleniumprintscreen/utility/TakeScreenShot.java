package com.seleniumprintscreen.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

	public static void ScreenShot(WebDriver driver, String ScreenShotName) throws Exception{
		
		// take screenshot and store as a file format             
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
		// copy the  screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("./ScreenShots/"+ScreenShotName+".png"));
	}
}
