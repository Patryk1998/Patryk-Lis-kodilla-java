package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DATA_SELECT_DAY = "//div[contains( @class, \"_58mq _5dbb\")]/div/span/span/select[1]";
    public static final String XPATH_DATA_SELECT_MONTH = "//div[contains( @class, \"_58mq _5dbb\")]/div/span/span/select[2]";
    public static final String XPATH_DATA_SELECT_YEAR = "//div[contains( @class, \"_58mq _5dbb\")]/div/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DATA_SELECT_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByIndex(24);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_DATA_SELECT_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByIndex(11);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_DATA_SELECT_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByIndex(21);
    }
}
