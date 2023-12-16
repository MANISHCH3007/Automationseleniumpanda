package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Base {
	
	
	public void user_enter_username_and_password() {
	  WebElement userName= driver.findElement(By.cssSelector("input#user-name"));
	  userName.sendKeys("standard_user");
	  WebElement password= driver.findElement(By.cssSelector("input#password"));
	  password.sendKeys("secret_sauce");
	}

	
	public void user_click_on_login_button() {
		WebElement loginBtn= driver.findElement(By.cssSelector("input#login-button"));
		  loginBtn.click(); 
	}

	
	public void validate_user_logged_in_successfully() {
	   System.out.println("validate");
	}

}
