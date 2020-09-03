package actions;

import org.openqa.selenium.WebDriver;

import pageobjects.GoogleObjects;

public class GoogleActions {

	static GoogleObjects objGoogle;

	public GoogleActions(WebDriver driver) {
		objGoogle = new GoogleObjects(driver);
	}

	public void pesquisaGoogle() {

		objGoogle.getInputPesquisa().sendKeys("Testando a pesquisa do google");
		objGoogle.getBtnPesquisa().click();

	}

}
