package stepdefinition;

import org.openqa.selenium.WebDriver;
import BasePackage.AllBrowserMethods;
import POMclassQRM.PracticePOM;
import io.cucumber.java.en.*;

public class PracticeStepDefination {

	public WebDriver driver;

	public PracticePOM pom = new PracticePOM(AllBrowserMethods.getDriver());

	@Given("Open the URL {string}")
	public void open_the_url(String string) {
		AllBrowserMethods.getDriver().get(string);
	}

	@Given("click on radio button")
	public void click_on_radio_button() throws InterruptedException {
		pom.clickonradio();
		Thread.sleep(1000);

	}

	@When("click on suggestion class")
	public void click_on_suggestion_class() throws InterruptedException {
		pom.addCountry();
		Thread.sleep(1000);

	}

	@When("Select from dropdown list")
	public void select_from_dropdown_list() throws InterruptedException {
		pom.selectdropdown();
		Thread.sleep(1000);


	}
	@When("Check from check box")
	public void check_from_check_box() throws InterruptedException {
	   pom.checkboxclick();
	   Thread.sleep(1000);

	}

	@When("Swiching to new window")
	public void swiching_to_new_window() throws InterruptedException {
		pom.switchtowindow();
		Thread.sleep(1000);

	}

	@Then("Open new tab")
	public void open_new_tab() throws InterruptedException {
		pom.clickontab();
		Thread.sleep(1000);

	}

	@Then("Swich to Alert")
	public void swich_to_alert() {

	}

}
