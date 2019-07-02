package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "//*[@id=\"gh-ac\"]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://ebay.com");

        WebElement searchField = webDriver.findElement(By.xpath(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
