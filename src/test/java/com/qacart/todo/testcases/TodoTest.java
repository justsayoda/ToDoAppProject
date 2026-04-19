package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewToDoPage;
import com.qacart.todo.pages.ToDoPage;
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
        String actualResult = loginPage
                .load()
                .login("sayoda@gmail.com","123456@SA")
                .clickOnPlusButton()
                .addNewTask("Learn Selenium")
                .getToDoText();

        Assert.assertEquals(actualResult, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteToDo(){
        LoginPage loginPage = new LoginPage(driver);
        boolean isNoToDoMessageIsDisplayed = loginPage
                .load()
                .login("sayoda@gmail.com","123456@SA")
                .clickOnDeleteButton()
                .isNoToDoMessageDisplayed();

        Assert.assertTrue(isNoToDoMessageIsDisplayed);
    }

}
