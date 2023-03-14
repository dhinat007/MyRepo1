package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarGuideHomePageActions;
import pages.actions.CarSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarGuideHomePageActions carGuideHomePageAction=new CarGuideHomePageActions();
	CarSearchPageActions carSearchPageAction=new CarSearchPageActions();
	
	@Given("I am on the home page {string} of carsguide")
	public void i_am_on_the_home_page_of_carsguide(String url) {
	    
		SeleniumDriver.openPage(url);
	}

	@When("I move to the menu")
	public void i_move_to_the_menu(List<String> menuList) {
		
		String menu=menuList.get(1).trim();
		carGuideHomePageAction.moveToBuySellMenu();
		
//		if (menu=="buysell"){
//			carGuideHomePageAction.moveToBuySellMenu();
//		}
		
	    
	}

	@When("click on {string} link")
	public void click_on_link(String linkName) {
		if(linkName=="searchCars"){
	    carGuideHomePageAction.clickOnSearchCarsLink();
		}
	    
	}

	@And("select car brand as {string} from anyMake dropdown")
	public void select_car_brand_as_from_any_make_dropdown(String brand) {
	   
	    	carSearchPageAction.selectCarMaker(brand);
	    
	   
	}

	@And("select car model as {string} from anyModel dropdown")
	public void select_car_model_as_from_any_model_dropdown(String model) {
		carSearchPageAction.selectCarModel(model);
	    
	}

	@And("select location as {string} from anyLocation dropdown")
	public void select_location_as_from_any_location_dropdown(String location) {
		carSearchPageAction.selectLocation(location);
	}

	@And("select price as {string} from price dropdown")
	public void select_price_as_from_price_dropdown(String price) {
		carSearchPageAction.selectPrice(price);
	    
	}

	@And("click on findMyNextCar button")
	public void click_on_find_my_next_car_button() {
		carSearchPageAction.clickFindMyNextCarBtn();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the page title should have {string}")
	public void the_page_title_should_have(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
