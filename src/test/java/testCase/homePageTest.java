package testCase;

import org.testng.annotations.Test;
import page.HomePage;
import utilities.DriverSetUp;
import utilities.DriverSetup01;


public class homePageTest extends HomePage {

    @Test
    public void testwithValidData() throws InterruptedException {

        acceptBtn.click();

    }

}
