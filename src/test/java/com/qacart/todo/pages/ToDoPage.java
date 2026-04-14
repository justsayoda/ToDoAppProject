package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToDoPage extends BasePage {

    public ToDoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-testid=\"welcome\"]")
    private WebElement welcomeMessage;

    @FindBy(css = "[data-testid=\"add\"]")
    private WebElement addButton;

    @FindBy(css = "[data-testid=\"todo-item\"]")
    private WebElement toDoItem;

    @FindBy(css = "[data-testid=\"delete\"]")
    private WebElement deleteButton;

    @FindBy(css = "[data-testid=\"no-todos\"]")
    private WebElement noToDoMessage;


    public boolean isWelcomeMessageIsDisplayed() {
        return welcomeMessage.isDisplayed();
    }

    public void clickOnPlusButton() {
        addButton.click();
    }

    public String getToDoText() {
        return toDoItem.getText();
    }

    public void clickOnDeleteButton() {
        deleteButton.click();
    }

    public boolean isNoToDoMessageDisplayed() {
        return noToDoMessage.isDisplayed();
    }


}
