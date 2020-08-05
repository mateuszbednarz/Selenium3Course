package com.mbednarz.phptravel.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import java.io.File;

/**
 * @author mbednarz
 * @created 19/07/2020 - 14:12
 * @project Selenium3Course
 */

/* -- LESSON 134: Driver Factory - klasa dostarczająca przeglądarkę -- */
/* -- LESSON 135: Refactoring kodu i używanie DriverService -- */
/* -- LESSON 136: DriverFactory - dodanie innych przeglądarek -- */

public class DriverFactory {
    private static WebDriver driverInstances;

    public static WebDriver getDriver(DriverType driverType) throws NoSuchDriverException
    {
        if (driverInstances == null)
        {
            getSpecifiedDriver(driverType);
            //System.out.println("Zmienna zostałą zainicjalizowana!");
            //String driverPath = "E:\\IT Knowledge Base\\DEV & QA\\Testing\\MB_Testing_Projects\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
            //System.setProperty("webdriver.chrome.driver", driverPath);
            driverInstances.manage().window().maximize();
        }

        return driverInstances;
    }

    private static void getSpecifiedDriver(DriverType driverType) throws NoSuchDriverException
    {
        switch (driverType)
        {
            case IE:
                // INTERNET EXPLORER DRIVER CONFIG
                File ieExe = new File("src//main//resources//executables//drivers//IEDriverServer.exe");
                InternetExplorerDriverService ieService = new InternetExplorerDriverService.Builder().usingDriverExecutable(ieExe).usingAnyFreePort().build();
                driverInstances = new InternetExplorerDriver(ieService);
            break;
            case CHROME:
                // CHROME DRIVER CONFIG
                File chromeExe = new File("src//main//resources//executables//drivers//chromedriver.exe");

                // 'Build' to wzorzec projektowy do budowania bardziej skomplikowanych obiektów ze specyficznych komponentów
                ChromeDriverService chromeService = new ChromeDriverService.Builder().usingDriverExecutable(chromeExe).usingAnyFreePort().build();
                driverInstances = new ChromeDriver(chromeService);
            break;
            case FIREFOX:
                // FIREFOX DRIVER CONFIG
                File firefoxExe = new File("src//main//resources//executables//drivers//geckodriver.exe");
                GeckoDriverService firefoxService = new GeckoDriverService.Builder().usingDriverExecutable(firefoxExe).usingAnyFreePort().build();
                driverInstances = new FirefoxDriver(firefoxService);
            break;

            default:
                System.out.println("There is no supported driver!");
                throw new NoSuchDriverException();
        }
    }
}
