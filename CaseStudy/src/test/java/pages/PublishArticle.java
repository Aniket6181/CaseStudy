package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublishArticle {
	
	@FindBy(className  = "nav-link ")
	WebElement newArticleButton;
	
	@FindBy(name = "title")
	WebElement articletitle;
	
	@FindBy(name = "description")
	WebElement articleabout;
	
	@FindBy(name = "body")
	WebElement article;
	
	@FindBy(className = "btn btn-lg pull-xs-right btn-primary")
	WebElement publisharticle;
	
	public PublishArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void publisharticle(String articleTitle, String articleAbout, String articleDesc) {
		newArticleButton.click();
		articletitle.sendKeys(articleTitle);
		articleabout.sendKeys(articleAbout);
		article.sendKeys(articleDesc);
		publisharticle.click();
	}

}