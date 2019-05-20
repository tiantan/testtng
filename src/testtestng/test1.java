package testtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void tes1(){		
		WebDriver	driver=new FirefoxDriver();
			driver.get("https://www.baidu.com/");;
			driver.manage().window().maximize();
			loginpage t=new loginpage(driver);
			t.kw("test");
		driver.close();
	}
}
