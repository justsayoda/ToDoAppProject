package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToDoPage extends BasePage {
    public NewToDoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement newToDoInput;

    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    private WebElement newToDoSubmit;

    public ToDoPage addNewTask(String item) {
        newToDoInput.sendKeys(item);
        newToDoSubmit.click();
        return new ToDoPage(driver);
    }
}
