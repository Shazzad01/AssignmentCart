package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.DriverSetUp;
import utilities.DriverSetup01;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Locale;

public class BasePage extends DriverSetup01 {


    public WebElement getElement(By locator){
        return driver.findElement(locator);

    }
    public void clickOnElement(By locator){
        getElement(locator).click();

    }

}
