package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SignUp;

public class SignUpStepDef {
	WebDriver driver = TestBase.getDriver();
	SignUp signUpPage;
	
	
	
	
	
	@Given("User is on Sign Up page")
	public void User_is_on_Sign_Up_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev");
	    
	}
	
	@When("User enters details")
	public void User_enters_details(String strUser,String strEmail, String strPwd){
		
		signUpPage.signup(strUser, strEmail, strPwd);
	
	}
	@Then("User click on signup button")
	public void User_click_on_signup_button() {
		
	}
	
	
	
	
	

}