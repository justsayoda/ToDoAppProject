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

public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddNewTodo(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayoda@gmail.com", "123456@SA");
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        String actualResult = driver.findElement(By.cssSelector("[data-testid=\"todo-item\"]")).getText();
        Assert.assertEquals(actualResult, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteToDo(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayoda@gmail.com", "123456@SA");

        driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();
        boolean isNoToDoMessageIsDisplayed = driver.findElement(By.cssSelector("[data-testid=\"no-todos\"]")).isDisplayed();
        Assert.assertTrue(isNoToDoMessageIsDisplayed);
    }

}
