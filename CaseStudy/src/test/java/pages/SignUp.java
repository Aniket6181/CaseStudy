package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	@FindBy(linkText  = "Sign up")
	WebElement signUpButton;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void signup(String strUser, String strEmail, String strPwd) {
		signUpButton.click();
		username.sendKeys(strUser);
		email.sendKeys(strEmail);
		password.sendKeys("strPassword");
		signUpButton.click();
	}

}