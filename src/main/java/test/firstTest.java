package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/@OnlineStudy4u");

//		driver.quit();

	}
}