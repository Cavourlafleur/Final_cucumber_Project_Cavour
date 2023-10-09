package StepsDefinition;

import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginAndPostionStep {
    Navigation navigation = new Navigation();
    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverClass.getDriver().get("https://test.mersys.io");

    }

    @Then("Click on human resource,Setup,Position")
    public void clickOnHumanResourceSetupPosition() {
        navigation.clickMethod(navigation.getHumanButton());
        navigation.clickMethod(navigation.getSetupButton());
        navigation.clickMethod(navigation.getPositionButton());
    }

    @And("Click on add sign button")
    public void clickOnAddSignButton() {
        navigation.clickMethod(navigation.getAddSignButton());
    }

    @Then("Insert name , short name and save")
    public void insertNameShortNameAndSave() {
        navigation.sendKeysMethod(navigation.getInsertName(),"Cavour Lafleur");
        navigation.sendKeysMethod(navigation.getInsertShortName(),"LF");
        navigation.clickMethod(navigation.getSaveButton());

    }

    @Given("Successful message is displayed")
    public void successfulMessageIsDisplayed() {
        navigation.waitUntilVisible(navigation.getSuccessfulMessage());
        Assert.assertTrue(navigation.getSuccessfulMessage().isDisplayed());
    }

    @Then("Locate edit button sigh and click")
    public void locateEditButtonSighAndClick() {
        navigation.clickMethod(navigation.getEditButton());

    }

    @And("Edit Name and save")
    public void editNameAndSave() {
        navigation.sendKeysMethod(navigation.getEditName(),"1");
        navigation.clickMethod(navigation.getSaveButton());
    }

    @Given("Successful message is displayed it has been edited")
    public void successfulMessageIsDisplayedItHasBeenEdited() {
        navigation.waitUntilVisible(navigation.getSuccessfulUpdateMessage());
        Assert.assertTrue(navigation.getSuccessfulUpdateMessage().isDisplayed());
    }

    @Then("Click on delete bucket and confirm delete")
    public void clickOnDeleteBucketAndConfirmDelete() {
        navigation.clickMethod(navigation.getDeleteButton());
        navigation.clickMethod(navigation.getDeleteConfirm());
    }

    @Then("Successful delete message should appear")
    public void successfulDeleteMessageShouldAppear() {
        navigation.waitUntilVisible(navigation.getSuccessfulDeleted());
        Assert.assertTrue(navigation.getSuccessfulDeleted().isDisplayed());
    }



    @Given("User name and password then Login")
    public void userNameAndPasswordThenLogin() {
        navigation.sendKeysMethod(navigation.getInsertUsername(),"turkeyts");
        navigation.sendKeysMethod(navigation.getInsertPassword(),"TechnoStudy123");
        navigation.clickMethod(navigation.getLoginButton());
    }

}

