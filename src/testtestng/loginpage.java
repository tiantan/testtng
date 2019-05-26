package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage extends Page{

	public loginpage(WebDriver driver) {
		super(driver);
	}
	public By userName=By.id("userName");
	public By password=By.id("password");
	public By btnLogin=By.id("btnLogin");
	
	public void userName(String username){
		this.geElement(userName).sendKeys(username);
	}
	public void password(String value){

		this.geElement(password).sendKeys(value);
	}
	public void btnLogin() {
		this.geElement(btnLogin).click();

	}

	public void Login(String username,String value){
		this.userName(username);
		this.password(value);
		this.btnLogin();
	}



}
