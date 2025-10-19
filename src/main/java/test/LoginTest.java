package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void validateTestLogin() {
		LoginPage  loginPage = new LoginPage(driver);
		loginPage.enterEmail("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
		System.out.println("The title :"+driver.getTitle());
		
	}

}
