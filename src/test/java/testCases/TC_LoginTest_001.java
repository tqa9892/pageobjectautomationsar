package testCases;

import objectOrientedpage.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_LoginTest_001 extends baseBrowser2 {
    // SoftAssert softassert = new SoftAssert();
    @Test
    public void loginTest1() {
        //logger.info("starting test");
        driver.get(burl);
        loginPage lp = new loginPage (driver);
        lp.setUnameM(uname);
        lp.setUpassM(upass);
        lp.setclickLogin();
        // String actualtitle = driver.getTitle();
        //softassert.assertEquals(actualtitle,"Welcome To Manager's Page of Guru99 Bank");
        if (driver.getTitle().equalsIgnoreCase("Welcome To Manager's Page of Guru99 Bank")) {
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);

        }
    }


}
