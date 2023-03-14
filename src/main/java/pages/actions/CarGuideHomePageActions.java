package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarGuideHomePageActions() {	
		
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	
	public void  moveToBuySellMenu(){
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buySellLink).perform();
	}
	
	public void clickOnSearchCarsLink(){
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.searchCarsLink).perform();
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void clickOnUsedLink(){
		carsGuideHomePageLocators.usedLink.click();
	}
	
	public void clickOnNewLink(){
		carsGuideHomePageLocators.newLink.click();
	}

}
