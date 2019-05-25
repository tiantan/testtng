package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class Page {
	public   WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}



	public  boolean waitToDisplayed(final By key){
		boolean waitDisplayed=new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver arg0) {
			return driver.findElement(key).isDisplayed();
			}		
		});	
		return waitDisplayed;		
	}
	
	protected WebElement geElement(By key){
		WebElement element=null;
		if(this.waitToDisplayed(key)){
			element=driver.findElement(key);
		}
		return element;
		
	}


}
