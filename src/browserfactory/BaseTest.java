package browserfactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest
{
    static String browser="Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";

    public static WebDriver driver;

    @BeforeClass
    public static void openBrowser() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();                                                                                  //Object creation for pop up
        //options.addArguments("--incognito ");                                                                                        //Open browser in private window
        options.addArguments("--disable-notifications");
        //options.addArguments("--headless=new");                                                                                  //Open browser in Headless

        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver= new ChromeDriver(options);
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver= new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox"))
        {
            driver= new FirefoxDriver();
        }
        else
        {
            System.out.println("Wrong browser");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(3000);
    }
    @AfterClass
    public static void closeBrowser()
    {
        driver.quit();
    }
}
