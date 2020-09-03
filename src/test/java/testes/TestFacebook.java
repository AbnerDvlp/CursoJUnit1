package testes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.HomeActions;
import actions.RecoverAccountActions;

class TestFacebook {

	static WebDriver driver;
	static HomeActions actHome;
	static RecoverAccountActions actRecAcc;
	
	@BeforeAll
	public static void iniciarTestes() {
		System.out.println("Inicia os testes com BeforeAll");
	}
	
	@BeforeEach
	public void openFacebook() {
		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\DriversBrowserSelenium\\chrome\\084\\chromedriver.exe ";
		System.setProperty("webdriver.chrome.driver", pathDriver);
		driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		actHome  = new HomeActions(driver);
		actRecAcc = new RecoverAccountActions(driver);
	}
	
	@Test
	@Tag("Tag1")
	public void singinFacebook() throws Exception {
		//assertEquals("https://pt-br.facebook.com", driver.getCurrentUrl());
		actHome.login();
	}
	
	//@Disabled("Teste de nova conta desabilitado!")
	@Test
	@Tag("Tag3")
	public void newAcc() throws Exception {
		actHome.newAccount();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"email1","email2","email3"})
	@Tag("Tag1")
	public void recoverAcc(String email) throws Exception {
		assertTrue(driver.getTitle().contains("Esqueci"), "The word not match!!");
		actHome.recoverAccount();
		actRecAcc.recoverPassword(email);
		
	}
	
	/*@AfterEach
	public void closeWindow() throws Exception {
		driver.close();
	}*/
	
	@AfterAll
	public static void finalizarTestes() {
		System.out.println("Finaliza os testes com AfterAll");
	}
	
}
