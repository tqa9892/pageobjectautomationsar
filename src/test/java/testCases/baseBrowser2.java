package testCases;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.propertyFileReader;

public class baseBrowser2 {
    propertyFileReader pfrObject = new propertyFileReader();
    public String burl = pfrObject.getUrl();
    public String uname = pfrObject.getuname();
    public String upass = pfrObject.getUpass();
    public static WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();// system.getproperties("user.dir") we can just replace it by using ./ dot slash to specify the current path.
                                                 // ./ can be use in java class and prop file as well
        driver = new ChromeDriver();
        logger = Logger.getLogger("ebanking");
        PropertyConfigurator.configure("Log4j.properties");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("tear down successfull");

    }
}
