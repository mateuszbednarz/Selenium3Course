import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest()
    {
        String driverPath = "E:\\mav-temp-iji\\Selenium3Course\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        //Dimension dimension = new Dimension(1300, 700); // web-browser window dimension parameters
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();
        driver.get("E://mav-temp-iji//pliki-dolaczone-do-kursu//Test.html");
        //driver.findElement(By.id("newPage")).click();
        //driver.close(); // zamyka okno na którym jest focus (obecnie znajduje się driver)
        //driver.quit(); // zamyka wszystkie otwarte okna przeglądarki

        //WebElement firstnameInput = driver.findElement(By.name("fname"));

        //WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        //WebElement clickOnMeButton2 = driver.findElementById("clickOnMe");

        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("IamWeirdLink"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));
    }
}
