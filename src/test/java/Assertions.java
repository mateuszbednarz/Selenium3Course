import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author mbednarz-home
 * @created 04/02/2020 - 21:48
 * @project Selenium3Course
 */

public class Assertions {

    @Test
    public void googleFindingsAssertionTest() throws InterruptedException {
        // HOME CONFIG
        String driverPath = "E:\\mav-temp-iji\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("E://mav-temp-iji//pliki-dolaczone-do-kursu//Test.html");

        // SOFLAB CONFIG
        //String driverPath = "C:\\Users\\mateusz.bednarz\\Documents\\IntelliJ-Projects\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", driverPath);
        //ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("C://Users//mateusz.bednarz//Documents//SelCourseTestWebPage//Test.html");

        driver.get("https://www.google.pl");
        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(3000, 0);
        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(3000, 0);
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        Thread.sleep(3000, 0);
        //searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("LC20lb"));
        Thread.sleep(3000, 0);
        seleniumPageLink.click();
        Thread.sleep(3000, 0);

        driver.quit();
    }
}
