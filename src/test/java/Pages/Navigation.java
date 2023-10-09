package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {
    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }
@FindBy(xpath = "//input[@placeholder='Username']")
private  WebElement InsertUsername;



    @FindBy(xpath = "//input[@placeholder='Password']")
    private  WebElement InsertPassword;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/form/button/span[2]")
    private  WebElement LoginButton;

@FindBy(xpath = "//span[text()='Human Resources']")
    private  WebElement HumanButton;

@FindBy(xpath = "(//span[text()='Setup'])[3]")
    private  WebElement SetupButton;

 @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private  WebElement PositionButton;

 @FindBy(xpath = "//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    private WebElement AddSignButton;

 @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement InsertName;

 @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private  WebElement InsertShortName;

 @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

 @FindBy(xpath = "//div[text()='Employee Position successfully created']")
    private  WebElement SuccessfulMessage;

 @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[12]")
 private  WebElement EditButton;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement EditName;

@FindBy(xpath = "//div[text()='Employee Position successfully updated']")
private  WebElement SuccessfulUpdateMessage;


    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[13]")
    private  WebElement DeleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
private WebElement DeleteConfirm;


    @FindBy(xpath = "//div[text()='Employee Position successfully deleted']")
    private  WebElement SuccessfulDeleted;

    public WebElement getHumanButton() {
        return HumanButton;
    }

    public WebElement getSetupButton() {
        return SetupButton;
    }

    public WebElement getPositionButton() {
        return PositionButton;
    }

    public WebElement getAddSignButton() {
        return AddSignButton;
    }

    public WebElement getInsertName() {
        return InsertName;
    }

    public WebElement getInsertShortName() {
        return InsertShortName;
    }

    public WebElement getSaveButton() {
        return SaveButton;
    }

    public WebElement getSuccessfulMessage() {
        return SuccessfulMessage;
    }

    public WebElement getEditButton() {
        return EditButton;
    }

    public WebElement getEditName() {
        return EditName;
    }

    public WebElement getSuccessfulUpdateMessage() {
        return SuccessfulUpdateMessage;
    }

    public WebElement getDeleteButton() {
        return DeleteButton;
    }

    public WebElement getDeleteConfirm() {
        return DeleteConfirm;
    }

    public WebElement getSuccessfulDeleted() {
        return SuccessfulDeleted;
    }

    public WebElement getInsertUsername() {
        return InsertUsername;
    }

    public WebElement getInsertPassword() {
        return InsertPassword;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }
}
