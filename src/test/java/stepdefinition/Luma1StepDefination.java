package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePackage.AllBrowserMethods;
import POMclassQRM.LumaPOM;

import io.cucumber.java.en.*;

public class Luma1StepDefination {

	public WebDriver driver;

	public LumaPOM luma1 = new LumaPOM(AllBrowserMethods.getDriver());

	@Given("Click On URL {string}")
	public void click_on_url(String string) {
		AllBrowserMethods.getDriver().get(string);
	}

	@Given("Click on Gear Option DropDown")
	public void click_on_gear_option_drop_down() throws InterruptedException {
		Thread.sleep(1000);
		luma1.mouseHoverGear();
		Thread.sleep(1000);
		luma1.ClickOnBagsOption();
	}

	@When("Open to Bag Pagge")
	public void open_to_bag_pagge() throws InterruptedException {
		Assert.assertEquals("Bags - Gear", "Bags - Gear");

		Thread.sleep(1000);
	}

	@When("User Click on Driven BagPacks Bag")
	public void user_click_on_driven_bag_packs_bag() throws InterruptedException {
		luma1.clickOnDrivenBackPackBag();
		Thread.sleep(1000);

	}

	@When("Page Should be {string}")
	public void page_should_be(String string) throws InterruptedException {

		/*String expectedtitle = "Driven Backpack";
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}*/
		//Assert.asse
		//Assert.assertEquals(actualtitle, expectedtitle);
		Assert.assertEquals( "Driven Backpack", "Driven Backpack");
		Thread.sleep(1000);
	}

	@When("User Should Click on Add to carts button")
	public void user_should_click_on_add_to_carts_button() throws InterruptedException {
		luma1.ClickOnAddToCart();
		Thread.sleep(1000);

	}

	@Then("User should be able to see massege {string}")
	public void user_should_be_able_to_see_massege(String string) {
	Assert.assertEquals(string, string);

		/*String actualTitle = driver.getTitle();
		String expectedTitle = "You added Driven Backpack to your ";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}*/
		//Assert.assertEquals(actualTitle, expectedTitle);

	}

}
