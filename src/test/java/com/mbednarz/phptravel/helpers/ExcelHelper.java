package com.mbednarz.phptravel.helpers;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * @author mbednarz
 * @created 08/08/2020 - 16:25
 * @project Selenium3Course
 */

/* -- LESSON 139: Czytanie danych z pliku Excela (.xlsx) -- */
/* -- LESSON 140: Czytanie danych z pliku Excela (.xls) -- */
/* -- LESSON 141: @DataProvider z pliku Excel (część 1) -- */
/* -- LESSON 142: @DataProvider z pliku Excel (część 2) -- */

public class ExcelHelper
{
    public static Object[][] readExcelFile(File file) throws IOException
    {
        InputStream is = new FileInputStream(file);
        /* aby odczytać dane z pliku .xls (starszy format Excel) zmieniamy klasę poniżej na 'HSSFWorkbook' */
        XSSFWorkbook wb = new XSSFWorkbook(is);
        Sheet sheet = wb.getSheetAt(0);

        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();

        String[][] data = new String[rowNumbers][colNumbers];

        for (int i = 0; i < rowNumbers; i++)
        {
            Row row = sheet.getRow(i + 1);

            for (int j = 0; j < row.getLastCellNum(); j++)
            {
                data[i][j] = row.getCell(j).getStringCellValue();
            }
        }

        return data;
        /*
        Iterator<Row> ri = sheet.rowIterator();
        while (ri.hasNext())
        {
            Row row = ri.next();
            row.cellIterator();
            Iterator<Cell> ci = row.cellIterator();

            while (ci.hasNext())
            {
                Cell cell = ci.next();
                if (cell.getCellType().equals(CellType.STRING))
                {
                    System.out.println(cell.getStringCellValue());
                } else if (cell.getCellType().equals(CellType.NUMERIC))
                    {
                        System.out.println(cell.getNumericCellValue());
                    }
            }
        }
        */
    }

    /*
    public static void main(String[] args) throws IOException
    {
        Object[][] data = readExcelFile(new File("src//main//resources//files//Dane.xlsx"));
        System.out.println(data[0][0]);
        System.out.println(data[0][8]);
    }
    */
}
