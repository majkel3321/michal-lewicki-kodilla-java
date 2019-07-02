package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String XPATH_NAME = "//*[@id=\"u_0_n\"]";
    public final static String XPATH_SURNAME = "//*[@id=\"u_0_p\"]";
    public final static String XPATH_NUMBER  = "//*[@id=\"u_0_s\"]";
    public final static String XPATH_PASSWORD = "//*[@id=\"u_0_z\"]";
    public final static String XPATH_DAY_OF_BIRTH = "//*[@id=\"day\"]";
    public final static String XPATH_MONTH_OF_BIRTH = "//*[@id=\"month\"]";
    public final static String XPATH_YEAR_OF_BIRTH = "//*[@id=\"year\"]";
    public final static String XPATH_SELECT_SEX_MALE = "//*[@id=\"u_0_13\"]/span[2]/label";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement nameInput = driver.findElement(By.xpath(XPATH_NAME));
        nameInput.sendKeys("Michal");

        WebElement surnameInput = driver.findElement(By.xpath(XPATH_SURNAME));
        surnameInput.sendKeys("Lewicki");

        WebElement numberInput = driver.findElement(By.xpath(XPATH_NUMBER));
        numberInput.sendKeys("4564564654");

        WebElement passwordInput = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordInput.sendKeys("Password111");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY_OF_BIRTH));
        Select select = new Select(selectDay);
        select.selectByIndex(9);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH_OF_BIRTH));
        select = new Select(selectMonth);
        select.selectByIndex(2);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR_OF_BIRTH));
        select = new Select(selectYear);
        select.selectByIndex(24);

        WebElement selectSex = driver.findElement(By.xpath(XPATH_SELECT_SEX_MALE));
        selectSex.click();
    }
}
