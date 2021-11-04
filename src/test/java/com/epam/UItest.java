package com.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UItest {

    private WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){

        if (driver != null)
            driver.close();
    }

    @Test
    public void testGooglePage()
    {
        driver.get("https://www.google.com/");
        By inputText = By.cssSelector("input[name='q']");
        WebElement input = driver.findElement(inputText);
        input.sendKeys("Movie Dune");

        By searchBtn = By.cssSelector("input.gNO89b");
        WebElement btnSearch = driver.findElement(searchBtn);
        btnSearch.click();
    }
}
