package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoverAccountObjects {

	@SuppressWarnings("unused")
	private WebDriver driver;

	@FindBy(id = "identify_email")
	private WebElement inputIdentifyEmail;

	@FindBy(id = "u_0_2")
	private WebElement btnSearch;

	//---------------------------------------------
	
	public RecoverAccountObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//---------------------------------------------
	
	public WebElement getInputIdentifyEmail() {
		return inputIdentifyEmail;
	}

	public void setInputIdentifyEmail(WebElement inputIdentifyEmail) {
		this.inputIdentifyEmail = inputIdentifyEmail;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}
	
	
	
	


}
