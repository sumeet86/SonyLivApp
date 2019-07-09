package com.testcase.sonyliv;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.base.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

@SuppressWarnings("deprecation")
public class LaunchAndExit extends Base{
	public static String deviceName= "Galaxy A50";
	public static String platformVersion= "9";
	public static String model ="RZ8M31M9CDE";
	public static String appPackage= "com.sonyliv";
	public static String appActivity ="tv.accedo.via.android.app.splash.InitializationActivity"; 

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities(deviceName, platformVersion, model, appPackage, appActivity);
		System.out.println("App Launched");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@content-desc='Open navigation menu']")).click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		driver.findElement(By.xpath("//*[@text='Exit App']")).click();
		System.out.println("App Exit to Home Screen");

	}
	
			
		

}
