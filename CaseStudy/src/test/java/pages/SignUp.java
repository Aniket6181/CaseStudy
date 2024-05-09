package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	@FindBy(xpath   = "(//a[@class='nav-link '])[2]")
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
	
	public void SignUpButton () {
		signUpButton.click();
	}

	public void signup(String strUser, String strEmail, String strPwd) {
		
		username.sendKeys(strUser);
		email.sendKeys(strEmail);
		password.sendKeys(strPwd);
		signUpButton.click();
	}

}