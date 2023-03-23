package POMclassQRM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PracticePOM {

	public WebDriver driver;

	public PracticePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * Webelements and methods for Luma bags
	 */

	@FindBy(xpath = "//input[@value='radio1']")
	public WebElement radio;

	public void clickonradio() {

		radio.click();
	}
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement country;

	public void addCountry() {

		country.sendKeys("India");
		
	}
	
	public void selectdropdown()
	{
		WebElement bm=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select opt=new Select(bm);
		opt.selectByIndex(1);
		opt.selectByValue("option1");
		opt.selectByVisibleText("Option3");
		
	
	
	}
	
	public void checkboxclick()
	{
		List<WebElement> element=driver.findElements(By.xpath("//input[@type='checkbox']"));
		element.get(0).click();
		element.get(1).click();
	}
	
	public void switchtowindow()
	{
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> mainwindow=driver.getWindowHandles();
		Iterator<String> abc=mainwindow.iterator();
		String window1=abc.next();
		String window2=abc.next();
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		
	}
	
	public void clickontab()
	{
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
	}
	
	}
	

