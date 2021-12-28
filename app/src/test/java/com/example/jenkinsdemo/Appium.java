package com.example.jenkinsdemo;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Appium {

    public static AndroidDriver<AndroidElement> driver;

    @AfterSuite
    public AndroidDriver<AndroidElement> setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String device = System.getProperty("deviceName");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
        capabilities.setCapability("appPackage", "com.example.jenkins_testcases_android");
        capabilities.setCapability("appActivity", "com.example.jenkins_testcases_android.MainActivity");
        capabilities.setCapability("dontStopAppOnReset", true);
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;

    }




}
