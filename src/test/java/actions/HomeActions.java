package actions;

import org.openqa.selenium.WebDriver;

import pageobjects.HomeObjects;

public class HomeActions {

	static HomeObjects objHome;

	public HomeActions(WebDriver driver) {

		objHome = new HomeObjects(driver);
	}

	public void login() {
		objHome.getInputEmail().sendKeys("email@eamil");
		objHome.getInputPassword().sendKeys("pass");
		objHome.getBtnLogin().click();
	}

	public void newAccount() {
		
		objHome.getBtnNewAccount().click();
		objHome.getHeaderSingIn().click();
		objHome.getInputName().click();
		objHome.getInputName().sendKeys("Abner");
		objHome.getInputLastName().sendKeys("Marcelino");
		objHome.getInputCellphoneEmail().sendKeys("email@email");
		objHome.getInputNewPassword().sendKeys("newpass");

		//objHome.getSelectDay()
		// objHome.getSelectMonth()
		// objHome.getSelectYear()

		objHome.getRadioMale().click();
		objHome.getBtnNewAccount().click();

	}

	public void recoverAccount() {
		objHome.getLinkForgotAccount().click();
	}

}
