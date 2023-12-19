import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class UserSteps {
    @And("I click On Admin Tab")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminTab();
    }
    @And("I Verify {string} Text")
    public void iVerifySystemUsersText() {
        Assert.assertEquals(new AdminPage().getSystemUserText(), "System Users", "Error message");
    }
    @And("I click on {string} Button")
    public void iClickOnAddButton() {
        new AdminPage().clickOnAddButton();
    }
    @And("I verify {string} Text on that field")
    public void iVerifyAddUserTextOnThatField() {
        Assert.assertEquals(new AdminPage().getAddUserText(), "Add User", "Error message");
    }
    @And("I select User Role {string}")
    public void iSelectUserRoleAdmin() {
        new AddUserPage().selectUserRoleAdmin("Admin");
    }
    @And("I enter employee name {string}")
    public void iEnterEmployeeNameLisa() {
        new AddUserPage().enterEmployeeName("Lisa");
    }
    @And("I  enter Username {string}")
    public void iEnterUsernameJohnsmith(int arg0) {
        new AddUserPage().enterEmployeeName("johnsmith1234567");
    }
    @And("I Select status {string}")
    public void iSelectStatusDisable() {
        new AddUserPage().clickOnStatusSelect();
    }
    @And("I  enter Password {string} in password field")
    public void iEnterPasswordJohnInPasswordField(int arg0) {
        new AddUserPage().enterPassword("John@1234");
    }
    @And("I enter Confirm Password  {string}")
    public void iEnterConfirmPasswordJohn(int arg0) {
        new AddUserPage().enterConfirmPassword("John@1234");
    }
    @And("I  click On {string} Button on page")
    public void iClickOnSaveButtonOnPage() {
        new AddUserPage().clickOnSave();
    }
    @Then("I verify message {string}")
    public void iVerifyMessageSuccessfullySaved() {
        Assert.assertEquals(new AddUserPage().getSuccessfullySavedText(),"Successfully Saved", "Error");
    }

    @And("I  enter Username {string} in username field")
    public void iEnterUsernameJohnsmithInUsernameField(int arg0) {
        new ViewSystemUsersPage().enterUsername("johnsmith1234567");
    }

    @And("I click On {string} Button in search field")
    public void iClickOnSearchButtonInSearchField() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }
    @Then("I Verify User should be in Result List")
    public void iVerifyUserShouldBeInResultList() {
        Assert.assertEquals(new ViewSystemUsersPage().getUserShouldBeInListText(), "User in Result list", "Error");
    }
    @And("Click on Check box")
    public void clickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }
    @And("Click on Delete Button in delete field")
    public void clickOnDeleteButtonInDeleteField() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }
    @And("Click on Ok Button on Popup")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }
    @Then("verify message {string} user deleted")
    public void verifyMessageSuccessfullyDeletedUserDeleted() {
        Assert.assertEquals(new ViewSystemUsersPage().getSuccessfullyDeletedText(),"Successfully Deleted", "Error");
    }

    @Then("Verify message {string}")
    public void verifyMessageNoRecordsFound() {
        Assert.assertEquals(new ViewSystemUsersPage().getNoRecordFoundText(), "No Record Found", "Error");
    }

    @And("I enter the following users details")
    public void iEnterTheFollowingUsersDetails(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> list : userList){
            System.out.println(list);
        }
    }

    @And("I Click on {string}")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("verify message {string}")
    public void verifyMessageRecordFound(int arg0) {
        Assert.assertEquals(new ViewSystemUsersPage().getNoRecordFoundText(),"No Record Found", "Error");
    }

    @Then("verify username {string}")
    public void verifyUsernameUsername() {
        Assert.assertEquals(new ViewSystemUsersPage().verifyUserName(), "username", "Error");
    }

    @And("I Click on Reset Tab")
    public void iClickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}
