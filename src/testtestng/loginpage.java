package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginpage extends Page{

	public loginpage(WebDriver driver) {
		super(driver);
	}	
	public By kw=By.id("kw");
	
	public void kw(String value){
		this.geElement(kw).sendKeys(value);;
	}
}
