package testCase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;                        //This Code working
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {

    public AndroidDriver<AndroidElement> driver;
    @BeforeSuite
    public void driverSetup() throws MalformedURLException {
        File f = new File("src");
        File fs = new File(f, "nopstationCart_4.40 1.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "pixel");
//        cap.setCapability("appPackage", "com.android.dialer");
//        cap.setCapability("appActivity", "com.android.dialer.main.impl.MainActivity");
        cap.setCapability("app", fs.getAbsolutePath());

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void quitDriver(){

        driver.removeApp("com.nopstation.nopcommerce.nopstationcart");
        driver.quit();
    }


    @Test
    public void testGeneralStore() throws InterruptedException {
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept")).click();
        Thread.sleep(6000);

    }

}


