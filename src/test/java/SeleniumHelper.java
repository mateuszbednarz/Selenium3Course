import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;

/**
 * @author mbednarz
 * @created 18/02/2020 - 21:23
 * @last_modified 18/02/2020 - 22:26
 * @project Selenium3Course
 */

/* -- LESSON 95: Tworzenie zrzutów okna przeglądarki -- */
public class SeleniumHelper
{
    private WebDriver driver;

    public SeleniumHelper(WebDriver newDriver)
    {
        this.driver = newDriver;
    }

    public void takeScreenshot()
    {
        try
        {
            TakesScreenshot screenshoter = (TakesScreenshot) driver;
            File screenshot = screenshoter.getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), Paths.get("src/main/resources/testsc-" + LocalTime.now().getNano() + ".png"));
        } catch (IOException e)
            {
                System.out.println("File not found!");
            }
    }
}
