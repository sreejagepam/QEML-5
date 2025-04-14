package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverManager() { }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            System.out.println("🔧 Creating new WebDriver instance...");
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            System.out.println("🧹 Quitting WebDriver...");
            driver.get().quit();
            driver.remove();
        }
    }
}