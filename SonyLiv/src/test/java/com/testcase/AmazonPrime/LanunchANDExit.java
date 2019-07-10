package com.testcase.AmazonPrime;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.base.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class LanunchANDExit extends Base{

	public static String deviceName= "Galaxy A50";
	public static String platformVersion= "9";
	public static String model ="RZ8M31M9CDE";
	public static String appPackage= "com.amazon.avod.thirdpartyclient";
	public static String appActivity =".LauncherActivity"; 

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities(deviceName, platformVersion, model, appPackage, appActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("App Launched");
		
		VerticalNavigation navi=new VerticalNavigation();
		navi.HomeSection(driver);
		navi.TVShows(driver);
		navi.Movies(driver);
		navi.Kids(driver);
		
	
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("App Exits");
		

	}

}
