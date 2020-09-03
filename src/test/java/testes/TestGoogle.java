package testes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.GoogleActions;

class TestGoogle {

	static WebDriver driver;
	static GoogleActions actGoogle;
	
	
	@BeforeAll
	public static void iniciarTestes() {
		System.out.println("Inicia os testes com BeforeAll");
	}
	
	@BeforeEach
	public void openFacebook() {
		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\DriversBrowserSelenium\\chrome\\084\\chromedriver.exe ";
		System.setProperty("webdriver.chrome.driver", pathDriver);
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		driver.manage().window().maximize();
		actGoogle  = new GoogleActions(driver);
	}
	
	@Test
	@Tag("Tag2")
	public void searchGoogle() throws Exception {
		actGoogle.pesquisaGoogle();
	}
	
	@AfterEach
	public void closeWindow() throws Exception {
		driver.close();
	}
	
	@AfterAll
	public static void finalizarTestes() {
		System.out.println("Finaliza os testes com AfterAll");
	}

}
