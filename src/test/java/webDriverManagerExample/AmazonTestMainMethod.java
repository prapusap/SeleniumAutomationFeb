package webDriverManagerExample;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestMainMethod {

	public static void main(String[] args) {

		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.amazon.in/");

	}

}
