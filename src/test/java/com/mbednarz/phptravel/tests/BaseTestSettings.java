package com.mbednarz.phptravel.tests;

import com.mbednarz.phptravel.helpers.DriverFactory;
import com.mbednarz.phptravel.helpers.DriverType;
import com.mbednarz.phptravel.helpers.NoSuchDriverException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * @author mbednarz-job
 * @created 05/02/2020 - 17:41
 * @last_modified 18/02/2020 - 19:17 [mbednarz-home]
 * @project kurs-selenium
 */

public abstract class BaseTestSettings
{
    protected WebDriver driver;

    /* -- LESSON 88: Tworzenie nadrzędnej klasy testowej -- */
    @BeforeTest
    public void setUp() throws NoSuchDriverException
    {
        System.out.println("Executed BEFORE test!");

        // DRIVER CONFIG
        //String driverPath = "E:\\IT Knowledge Base\\DEV & QA\\Testing\\MB_Testing_Projects\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", driverPath);
        driver = DriverFactory.getDriver(DriverType.IE);
    }

    @AfterTest
    public void tearDown()
    {
        System.out.println("Executed AFTER test!");
        driver.quit();
    }
}
