package actions;

import org.openqa.selenium.WebDriver;

import pageobjects.RecoverAccountObjects;

public class RecoverAccountActions {
	
	static RecoverAccountObjects objRecAcc;

	public RecoverAccountActions(WebDriver driver) {
		objRecAcc = new RecoverAccountObjects(driver);
	}
	
	public  void  recoverPassword(String email) {
		
		objRecAcc.getInputIdentifyEmail().sendKeys(email);
		objRecAcc.getBtnSearch().click();
	}

}
