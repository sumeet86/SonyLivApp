package com.testcase.AmazonPrime;

import org.openqa.selenium.By;

import com.base.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NavigationTopToBottom extends Base {

	public void HomeSection(AndroidDriver<AndroidElement> driver) throws InterruptedException {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.amazon.avod.thirdpartyclient:id/LandingPageScrollView\")).scrollIntoView(new UiSelector().text(\"Lifestyle\"));");
		System.out.println("Lifestyle found");
		Thread.sleep(5000);

	}

	public void TVShows(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='TV Shows']")).click();
		System.out.println("Moved to TV Shows Section");
		Thread.sleep(2000);

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.amazon.avod.thirdpartyclient:id/LandingPageScrollView\")).scrollIntoView(new UiSelector().text(\"Anime TV\"));");
		System.out.println("Anime TV found");
		Thread.sleep(5000);
	}

	public void Movies(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='Movies']")).click();
		System.out.println("Moved to Movies Section");
		Thread.sleep(2000);

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.amazon.avod.thirdpartyclient:id/LandingPageScrollView\")).scrollIntoView(new UiSelector().text(\"Movies in Gujarati \"));");
		System.out.println(" Movies in Gujarati found");
		Thread.sleep(5000);
	}

	public void Kids(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='Kids']")).click();
		Thread.sleep(2000);
		System.out.println("Moved To Kids section");

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.amazon.avod.thirdpartyclient:id/LandingPageScrollView\")).scrollIntoView(new UiSelector().text(\"Movies and TV shows with animals\"));");
		System.out.println("Movies and TV shows with animals found");
		Thread.sleep(5000);
	}

}
