package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.loginPage;


public class loginStepDefination {
	
	loginPage lp = new loginPage();;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    System.out.println("Step 1: User is on login page");
	    //Open Firefox
	    lp.openBrowser();
	    
	    //Open Scotiabank login page
	    lp.openScotiabankLoginPage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
		 System.out.println("Step 2: The title of the login page is Sign in | Scotiabank");
		 //Verify the title
		 String expectedTitle = title;
		 String actualTitle = lp.getTitle();
		 System.out.println(actualTitle);
		 Assert.assertEquals(expectedTitle, actualTitle);
		 
		 
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
		 System.out.println("Step 3: User enters email id and password");
		 System.out.println(email);
		 System.out.println(password);
		 //Enter emailid and password
		 lp.enterWrongEmailWithSpecialChar(email);
		 lp.enterWrongPassword(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		 System.out.println("Step 4: User clicks in login button");
		 //Click on login button
		 lp.clickOnLoginButton();
	}

	@Then("^user get error message$")
	public void user_get_error_message() throws Throwable {
		 System.out.println("Step 5: User get the error message");;
		 //Verify the error msg
		 String expectedErr = "Please enter a username or card number without special characters.";
		 String actualErr = lp.readErr();
		 
		 Assert.assertEquals(expectedErr, actualErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		 System.out.println("Step 6: User Quit");
		 // Close the page
		 lp.closeBrowser();
	}


}
