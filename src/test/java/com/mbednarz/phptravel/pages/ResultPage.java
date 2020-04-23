package com.mbednarz.phptravel.pages;

import com.mbednarz.phptravel.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mbednarz
 * @created 23/04/2020 - 13:14
 * @project Selenium3Course
 */

/* -- LESSON 126: Dodanie nowego Page Object -- */

public class ResultPage
{
    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;

    private SeleniumHelper helper;

    public ResultPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        helper = new SeleniumHelper(driver);
    }

    // jest to część strony ResultPage
    public List<String> getHotelNames()
    {
        List<String> hotelNamesList = new ArrayList<>();
        helper.waitForListOfWebElements(resultsTable.findElements(By.xpath(".//h4//b")));
        List<WebElement> hotelNamesWebElements = resultsTable.findElements(By.xpath("//h4//b"));

        for(WebElement hotelNameElement : hotelNamesWebElements)
        {
            System.out.println(hotelNameElement.getText());
            hotelNamesList.add(hotelNameElement.getText());
        }

        return hotelNamesList;
    }

    // jest to część strony ResultPage
    public List<String> getHotelPrices()
    {
        List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class, 'price_tab')]//b"));
        List<String> prices = hotelPrices.stream().map(element -> element.getText()).collect(Collectors.toList());

        return prices;
    }
}
