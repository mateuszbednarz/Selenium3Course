package com.mbednarz.phptravel.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import java.io.File;
import java.io.IOException;

/**
 * @author mbednarz
 * @created 19/07/2020 - 14:12
 * @project Selenium3Course
 */

/* -- LESSON 134: Driver Factory - klasa dostarczająca przeglądarkę -- */
/* -- LESSON 135: Refactoring kodu i używanie DriverService -- */
/* -- LESSON 136: DriverFactory - dodanie innych przeglądarek -- */
/* -- LESSON 138: Odpalamy test przy pomocy Firefoxa -- */

public class DriverFactory {
    private static WebDriver driverInstance;

    public static WebDriver getDriver(DriverType driverType) throws NoSuchDriverException, IOException {
        if (driverInstance == null)
        {
            getSpecifiedDriver(driverType);
            //System.out.println("Zmienna zostałą zainicjalizowana!");
            //String driverPath = "E:\\IT Knowledge Base\\DEV & QA\\Testing\\MB_Testing_Projects\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
            //System.setProperty("webdriver.chrome.driver", driverPath);
            driverInstance.manage().window().maximize();
        }

        return driverInstance;
    }

    private static void getSpecifiedDriver(DriverType driverType) throws NoSuchDriverException, IOException {
        switch (driverType)
        {
            case IE:
                // INTERNET EXPLORER DRIVER CONFIG
                File ieExe = new File("src//main//resources//executables//drivers//IEDriverServer.exe");
                InternetExplorerDriverService ieService = new InternetExplorerDriverService.Builder().usingDriverExecutable(ieExe).usingAnyFreePort().build();
                driverInstance = new InternetExplorerDriver(ieService);
            break;
            case EDGE:
                // INTERNET EXPLORER DRIVER CONFIG
                File edgeExe = new File("src//main//resources//executables//drivers//msedgedriver.exe");
                EdgeDriverService edgeService = new EdgeDriverService.Builder().usingDriverExecutable(edgeExe).usingAnyFreePort().build();
                driverInstance = new EdgeDriver(edgeService);
            break;
            case CHROME:
                // CHROME DRIVER CONFIG
                File chromeExe = new File("src//main//resources//executables//drivers//chromedriver.exe");

                // 'Build' to wzorzec projektowy do budowania bardziej skomplikowanych obiektów ze specyficznych komponentów
                ChromeDriverService chromeService = new ChromeDriverService.Builder().usingDriverExecutable(chromeExe).usingAnyFreePort().build();
                driverInstance = new ChromeDriver(chromeService);
            break;
            case FIREFOX:
                // FIREFOX DRIVER CONFIG

                File firefoxExe = new File("src//main//resources//executables//drivers//geckodriver.exe");
                GeckoDriverService firefoxService = new GeckoDriverService.Builder().usingDriverExecutable(firefoxExe).usingAnyFreePort().build();
                FirefoxOptions ffo = new FirefoxOptions();
                driverInstance = new FirefoxDriver(firefoxService,ffo);
            break;

            default:
                System.out.println("There is no supported driver!");
                throw new NoSuchDriverException();
        }
    }

    public static void resetDriver()
    {
        driverInstance = null;
    }
}
