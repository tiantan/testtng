package testtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class test1 {
	@Test
	public void tes1(){

		System.setProperty("webdriver.gecko.driver","G:\\IDEAjb\\testtng\\libs\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.baidu.com");
		wd.close();
		/*
		WebDriver	driver=new FirefoxDriver();
			driver.get("https://www.baidu.com/");;
			driver.manage().window().maximize();
		//	loginpage t=new loginpage(driver);
			//t.kw("test");
		driver.close();
		 */
	}
}
