package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By emailBox = By.id("Email");
	private By passwordBox = By.id("Password");
	private By loginBox = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public   LoginPage(WebDriver driver ) {
		this.driver = driver;
	}
	
	public void enterEmail(String username) {
		driver.findElement(emailBox).clear();
		driver.findElement(emailBox).sendKeys(username);
		
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordBox).clear();
		driver.findElement(passwordBox).sendKeys(password);
		
		
	}
	
	public void clickLogin() {
		driver.findElement(loginBox).click();
		   
	}
}
