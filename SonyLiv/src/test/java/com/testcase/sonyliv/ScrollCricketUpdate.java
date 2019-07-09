package com.testcase.sonyliv;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollCricketUpdate extends Base {
	
		public static String deviceName= "Galaxy A50";
		public static String platformVersion= "9";
		public static String model ="RZ8M31M9CDE";
		public static String appPackage= "com.sonyliv";
		public static String appActivity ="tv.accedo.via.android.app.splash.InitializationActivity"; 

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities(deviceName, platformVersion, model, appPackage, appActivity);
		System.out.println("App Launched");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView("
		// + "new UiSelector().text(\"Cricket Updates\"));");

		//List<MobileElement> element = (List<MobileElement>) driver.findElement(By.id("com.sonyliv:id/slideshow_banner"));
		//Point location = ((WebElement) element).getLocation();
		//System.out.println(location);
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.sonyliv:id/drawer_layout\")).scrollIntoView(new UiSelector().text(\"Cricket Updates\"));");
		System.out.println("Cricket Updates found");
		
	}



}
