package testtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//测试类
public class test1 {
	@Test
	public void tes1(){
			System.setProperty("webdriver.gecko.driver",".\\libs\\geckodriver.exe");
			WebDriver	driver=new FirefoxDriver();
			driver.get("https://www.baidu.com/");;
			driver.manage().window().maximize();
			loginpage t=new loginpage(driver);
			//t.kw("test");
			driver.close();
	}
}
