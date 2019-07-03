package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Base {
	
	
	public static  AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("deviceName", "Galaxy A50");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("model", "RZ8M31M9CDE");
		cap.setCapability("platformName", "Android");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		cap.setCapability("appPackage", "com.sonyliv");
		cap.setCapability("appActivity", "tv.accedo.via.android.app.splash.InitializationActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;

	}
		
	

}
