package com.testcase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import com.base.Base;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollCricketUpdate extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		System.out.println("App Launched");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
    //            + "new UiSelector().text(\"Cricket Updates\"));");
		
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.sonyliv:id/drawer_layout\")).scrollIntoView(new UiSelector().text(\"Cricket Updates\"));");
 System.out.println("Cricket Updates found");
	}

}
