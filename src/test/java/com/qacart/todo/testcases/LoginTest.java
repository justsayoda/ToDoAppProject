package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.ToDoPage;
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

        ToDoPage todoPage = new ToDoPage(driver);
        boolean isWelcomeDisplayed = todoPage.isWelcomeMessageIsDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
    }
}
