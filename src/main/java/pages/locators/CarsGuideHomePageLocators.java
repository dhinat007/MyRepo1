package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.CSS,using="a[data-gtm-label='top nav car buy and sell']")
	public WebElement buySellLink;
	
	@FindBy(how=How.XPATH,using="//div[@id='u_H']/div[1]/div[1]/ul[1]/li[2]/a[1]")
	public WebElement reviewsLink;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Search Cars')]")
	public WebElement searchCarsLink;
	
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Used')])[1]")
	public WebElement usedLink;
	
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'New')])[1]")
	public WebElement newLink;
	
	
	

}
