package com.mbednarz;

import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteToFile {

    @Test
    public void fileWriting() throws IOException
    {
        File f = new File("src/main/resources/WrittenFileMB.txt");
        BufferedWriter w = Files.newWriter(f, Charset.defaultCharset());

        w.write("To jest linia zapisana do pliku za pomocą programu napisanego w Java");
        w.close();
    }
}
