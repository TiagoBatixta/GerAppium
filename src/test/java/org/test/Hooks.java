package org.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    public static AppiumDriver<?> driver;
    public static AppiumDriver<?> capabilitiesDriver() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "br.com.stone.posandroid.launcherapp");
        capabilities.setCapability("appActivity", "br.com.stone.launcherapp.view.idle.IdleActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "0123abcd");
        capabilities.setCapability("uiautomator2ServerInstallTimeout", 600000);


        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }
    public static AppiumDriver<?> getDriver(){
        return driver;
    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
        }
    }

    @Before
    public static void startProject() throws MalformedURLException{
        if (getDriver() != null){
            getDriver().launchApp();
        }else{
            capabilitiesDriver();
        }
    }
}
