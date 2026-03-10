package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void ShouldBeAbleToLoginWithEmailAndPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayoda@gmail.com", "123456@SA");

        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
    }
}
