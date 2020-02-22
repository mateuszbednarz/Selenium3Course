import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * @author mbednarz
 * @created 21/02/2020 - 13:34
 * @project Selenium3Course
 */

/* -- LESSON 98: Upload techniki alternatywne -- */
public class FileUploadWithRobot extends BaseSeleniumTest
{
    public void uploadFile(String path) throws AWTException
    {
        // klikamy na przycisk 'Wybierz plik'
        driver.findElement(By.id("myFile")).click();

        // tworzymy obiekt klasy Robot
        Robot robot = new Robot();

        // oczekiwanie 2 sekundy na pojawienie się okna uploadu pliku
        robot.delay(2000);

        // skopiowanie ścieżki do pliku do pamięci podręcznej
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection("src/main/resources/testsc-127000000.png");
        clipboard.setContents(stringSelection, stringSelection);

        // symulacja wciśnięcia i puszczenia przycisków CTRL + V (wklejenie)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // symulacja wciśnięcia przycisku ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
