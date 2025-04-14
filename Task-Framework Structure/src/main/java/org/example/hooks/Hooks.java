package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.DriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        System.out.println("Browser started before scenario.");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        System.out.println("Browser closed after scenario.");
    }
}
