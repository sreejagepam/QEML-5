package org.example.stepdefinitions.ui;

import org.example.DriverManager;
import org.example.PageFactoryManager;
import io.cucumber.java.en.*;
import org.example.pages.User;
import org.example.utils.UserBuilder;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class LoginSteps {

    @Given("the user is on the login page")
    public void navigateToLoginPage() {
        DriverManager.getDriver().get("http://localhost:9000/login");
    }

    @When("the user enters username {string} and password {string}")
    public void enterLoginCredentials(String username, String password) {
        User user = new UserBuilder()
                .withUsername(username)
                .withPassword(password)
                .build();

        PageFactoryManager.getLoginPage(DriverManager.getDriver())
                .login(user.getUsername(), user.getPassword());
    }

    @Then("the user successfully logs in")
    public void verifyLoginSuccess() {
        // Add verification logic
//        WebElement successMsg = DriverManager.getDriver().findElement(By.id("home-logged-message"));
//        String actualText = successMsg.getText();
//        assertEquals(actualText, "You are logged in as user \"admin\".",
//                "Login success message does not match!");
    }
}
