package Util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class Utilities {
    public static WebDriver driver;

    public static WebDriver driverSetup() {
       /* String AppURL = "https://courses.ultimateqa.com/";
        System.setProperty("webdriver.ie.driver", "D:\\Automation\\SLC\\IEDriverServer-64bit.exe");
        driver = new InternetExplorerDriver();
        driver.get(AppURL);
        return driver;*/

/*
        File ieFile = new File("D:\\Automation\\SLC\\IEDriverServer-64bit.exe");
        System.setProperty("webdriver.ie.driver", ieFile.getAbsolutePath());
        DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
        ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://courses.ultimateqa.com");
        driver = new InternetExplorerDriver(ieCaps);*/

        File chromeFile = new File("D:\\Automation\\SLC\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }



    public static void verifyLink(boolean isLinkpresent) throws Exception {
        Assert.assertTrue(isLinkpresent);
    }

}

