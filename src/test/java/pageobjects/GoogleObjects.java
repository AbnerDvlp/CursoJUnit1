package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleObjects {
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(name="q")
	private WebElement inputPesquisa;
	
	@FindBy(name="btnK")
	private WebElement btnPesquisa;
	
	public GoogleObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	
//--------------------------------------------------------------
	
	public WebElement getInputPesquisa() {
		return inputPesquisa;
	}

	public void setInputPesquisa(WebElement inputPesquisa) {
		this.inputPesquisa = inputPesquisa;
	}

	public WebElement getBtnPesquisa() {
		return btnPesquisa;
	}

	public void setBtnPesquisa(WebElement btnPesquisa) {
		this.btnPesquisa = btnPesquisa;
	}
	
	
	
	
	

}
