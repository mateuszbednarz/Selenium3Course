import org.testng.annotations.Test;
import com.google.common.io.Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadFromFile {

    @Test
    public void fileReading()
    {
        File f = new File("src/main/resources/FirstTextFile.txt");

        try
        {
            BufferedReader r = Files.newReader(f, Charset.defaultCharset());
            String textLine;

            while ((textLine = r.readLine()) != null)
            {
                System.out.println("Readed text line: " + textLine);
            }

        } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            } catch (IOException e)
                {
                    e.printStackTrace();
                }
    }
}
