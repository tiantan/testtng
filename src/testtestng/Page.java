package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
把所有常用的方法，封装到page类，这样在其它中直接调用
 */
public class Page  {
	protected    WebDriver driver;

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
