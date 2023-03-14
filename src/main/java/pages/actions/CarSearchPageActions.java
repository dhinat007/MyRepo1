package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}

	public void selectCarMaker(String carMake) {

		Select selectMake = new Select(carSearchPageLocators.makeDropdown);
		selectMake.selectByVisibleText(carMake);
	}

	public void selectCarModel(String carModel) {

		Select selectModel = new Select(carSearchPageLocators.modelDropdown);
		selectModel.selectByVisibleText(carModel);
	}

	public void selectLocation(String carLocation) {

		Select selectLocation = new Select(carSearchPageLocators.locationDropdown);
		selectLocation.selectByVisibleText(carLocation);
	}

	public void selectPrice(String price) {

		Select selectPrice = new Select(carSearchPageLocators.priceDropdown);
		selectPrice.selectByVisibleText(price);
	}

	public void clickFindMyNextCarBtn() {

		carSearchPageLocators.findMyNextCarBtn.click();

	}

}
