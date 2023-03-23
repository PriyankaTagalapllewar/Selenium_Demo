package POMclassQRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaPOM {
	
public WebDriver driver;
	
	public LumaPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
	public WebElement gear;
	
	public void mouseHoverGear() {
		Actions act=new Actions(driver);
		act.moveToElement(gear).build().perform();
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Bags']")
	public WebElement bags;
	
	public void ClickOnBagsOption() {
		bags.click();
	}
	
	/*
	 * method for getting title of a page
	 */
	
	public void gettitlemethod() {
		System.out.println(driver.getTitle()+ "***********************************************");
		//return driver.getTitle();
	}
	@FindBy(xpath="//a[@class='product photo product-item-photo']//img[@alt='Driven Backpack']")
	public WebElement DrivenBackPackClick;
	
	public void clickOnDrivenBackPackBag() {
		DrivenBackPackClick.click();
		
	}


	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	public WebElement DrivenBackPackAddToCart;
	
	public void ClickOnAddToCart() {
		DrivenBackPackAddToCart.click();
	}
	
	@FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
	public WebElement getconfirmationmsg;
	
	public String MessageAfterAddToCart() {
		return getconfirmationmsg.getText();
	}

	
}
