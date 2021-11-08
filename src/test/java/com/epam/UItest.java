package com.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){

//        if (driver != null)
//            driver.close();
    }

    @Test
    public void testEpamCareerPage()
    {
        driver.get("https://www.epam.com/careers");
        By keywordTxt = By.id("new_form_job_search_1445745853_copy-keyword");
        WebElement keyword = driver.findElement(keywordTxt);
        keyword.sendKeys("Test automation");

        By submitBtn = By.cssSelector(".recruiting-search__submit");
        WebElement submit = driver.findElement(submitBtn);
        submit.click();
    }
}
