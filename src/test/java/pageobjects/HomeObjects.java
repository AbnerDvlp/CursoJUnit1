package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
	private WebElement inputEmail;
	
	@FindBy(id="pass")
	private WebElement inputPassword;
	
	@FindBy(id="u_0_b")
	private WebElement btnLogin;
	
	@FindBy(partialLinkText="Esqueceu a conta?")
	private WebElement linkForgotAccount;
	
	@FindBy(id="u_0_2")
	private WebElement btnNewAccount;
	
	//-----------------------------page new account
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")
	private WebElement inputName;
	
	@FindBy(id="u_a_d")
	private WebElement inputLastName;
	
	@FindBy(id="u_a_g")
	private WebElement inputCellphoneEmail;
	
	@FindBy(id="password_step_input")
	private WebElement inputNewPassword;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[1]/div[2]")
	private WebElement headerSingIn;
	
	//-----------------------------page new account/birth date
	
	
	@FindBy(id="day")
	private WebElement selectDay;
	
	@FindBy(id="month")
	private WebElement selectMonth;
	
	@FindBy(id="year")
	private WebElement selectYear;
	
	//-----------------------------page new account/gender
	
	@FindBy(id="u_a_4")
	private WebElement radioFemale;
	
	@FindBy(id="u_a_5")
	private WebElement radioMale;
	
	@FindBy(id="u_a_6")
	private WebElement radioCustom;
	
	@FindBy(id="u_a_s")
	private WebElement btnSingup;

	
	
	//-----------------------------------------------------
	
	public HomeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//------------------------------------------------------

	public WebElement getInputEmail() {
		return inputEmail;
	}



	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}



	public WebElement getInputPassword() {
		return inputPassword;
	}



	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}



	public WebElement getBtnLogin() {
		return btnLogin;
	}



	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}



	public WebElement getLinkForgotAccount() {
		return linkForgotAccount;
	}



	public void setLinkForgotAccount(WebElement linkForgotAccount) {
		this.linkForgotAccount = linkForgotAccount;
	}



	public WebElement getBtnNewAccount() {
		return btnNewAccount;
	}



	public void setBtnNewAccount(WebElement btnNewAccount) {
		this.btnNewAccount = btnNewAccount;
	}



	public WebElement getInputName() {
		return inputName;
	}



	public void setInputName(WebElement inputName) {
		this.inputName = inputName;
	}



	public WebElement getInputLastName() {
		return inputLastName;
	}



	public void setInputLastName(WebElement inputLastName) {
		this.inputLastName = inputLastName;
	}



	public WebElement getInputCellphoneEmail() {
		return inputCellphoneEmail;
	}



	public void setInputCellphoneEmail(WebElement inputCellphoneEmail) {
		this.inputCellphoneEmail = inputCellphoneEmail;
	}



	public WebElement getInputNewPassword() {
		return inputNewPassword;
	}



	public void setInputNewPassword(WebElement inputNewPassword) {
		this.inputNewPassword = inputNewPassword;
	}



	public WebElement getSelectDay() {
		return selectDay;
	}



	public void setSelectDay(WebElement selectDay) {
		this.selectDay = selectDay;
	}



	public WebElement getSelectMonth() {
		return selectMonth;
	}



	public void setSelectMonth(WebElement selectMonth) {
		this.selectMonth = selectMonth;
	}



	public WebElement getSelectYear() {
		return selectYear;
	}



	public void setSelectYear(WebElement selectYear) {
		this.selectYear = selectYear;
	}



	public WebElement getRadioFemale() {
		return radioFemale;
	}



	public void setRadioFemale(WebElement radioFemale) {
		this.radioFemale = radioFemale;
	}



	public WebElement getRadioMale() {
		return radioMale;
	}



	public void setRadioMale(WebElement radioMale) {
		this.radioMale = radioMale;
	}



	public WebElement getRadioCustom() {
		return radioCustom;
	}



	public void setRadioCustom(WebElement radioCustom) {
		this.radioCustom = radioCustom;
	}



	public WebElement getBtnSingup() {
		return btnSingup;
	}



	public void setBtnSingup(WebElement btnSingup) {
		this.btnSingup = btnSingup;
	}
	
	
	public WebElement getHeaderSingIn() {
		return headerSingIn;
	}

	public void setHeaderSingIn(WebElement headerSingIn) {
		this.headerSingIn = headerSingIn;
	}
	
	
	
	
	

}
