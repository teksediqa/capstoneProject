package tek.sdet.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user clicked on Sign in Option");
		
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passValue);
		logger.info("user entered email and password");
	}
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("user is logged in into Account");
	} 
	@When("User click on Create New account button")
	public void userClickOnCreateNewAccountButton() { 
		click(factory.signInPage().createNewAccountButton);
		logger.info("user clicked on Creat New Account button");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps(String.class,String.class); 
	    sendText(factory.signInPage().creatNewAccountNameField, data.get(0).get("name")); 
	    sendText(factory.signInPage().creatNewAccountEmailField, data.get(0).get("email")); 
	    sendText(factory.signInPage().createNewAccountPasswordField, data.get(0).get("password")); 
	    sendText(factory.signInPage().createNewAccountConfirmPasswordField, data.get(0).get("confirmPassword")); 
	    logger.info("user filled the signUp information form");
	    
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    // Write code here that turns the phrase above into concrete actions 
		click(factory.signInPage().signUpButton); 
		logger.info("user clicked on signup button");
	    
	}
	@Then("User should be logged into account page") 
	public void userShouldBeLoggedIntoAccountPage() { 
		//Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfilePicture)); 
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfilePicture));
		logger.info("user is logged into account page");
	    // Write code here that turns the phrase above into concrete actions
	    
	}



	
}




