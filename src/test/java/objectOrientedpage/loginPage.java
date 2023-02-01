package objectOrientedpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver lriver;

      public loginPage(WebDriver rdriver) {
        lriver = rdriver;
        PageFactory.initElements(rdriver, this);


    }

    @FindBy(xpath = "//input[@name='uid']")
    @CacheLookup
    WebElement txtusername;

    @FindBy(xpath = "//input[@name='password']")
    @CacheLookup
    WebElement txtpassword;

    @FindBy(xpath = "//input[@name='btnLogin']")
    @CacheLookup
    WebElement loginbutton;

    public void setUnameM(String uname) {
        txtusername.sendKeys(uname);

    }

    public void setUpassM(String upass) {
        txtpassword.sendKeys(upass);
    }

    public void setclickLogin() {
        loginbutton.click();
    }


}
