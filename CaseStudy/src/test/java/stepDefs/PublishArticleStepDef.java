package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PublishArticle;
import pages.SignUp;

public class PublishArticleStepDef {
	WebDriver driver = TestBase.getDriver();
	PublishArticle publishArticlePage;
	
	
	
		
	
	
	@Given("User is on new article page")
	public void User_is_on_new_article_page () {
		
	}
	
	@When("Use enters article details and publish article")
	public void use_enters_article_details_and_publish_article(String articleTitle, String articleAbout, String articleDesc) {
		publishArticlePage.publisharticle(articleTitle,  articleAbout,  articleDesc);
	    
	}
	@Then("Article is published")
	public void article_is_published() {
	    
	}
	
	
	
	
}	
