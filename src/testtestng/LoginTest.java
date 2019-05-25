package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver;
    @BeforeSuite
    public void setup(){
        //用于第一次启动浏览器
        //66
        //System.setProperty("webdriver.gecko.driver",".\\libs\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver",".\\libs\\chromedriver.exe");
        //WebDriver driver=new FirefoxDriver();
        driver=new ChromeDriver();
        // driver.get("http://localhost:8005/");
        driver.get("http://localhost/intest/login.html?r=0.8770877012611458");
        driver.manage().window().maximize();
    }
    @Test
    public void LoginTest() throws InterruptedException {
        loginpage t=new loginpage(driver);
        t.Login("hr","123456");
       // Thread.sleep(10000);
        new wait(driver).waitToDisplayed(By.id("top-nav-ess-name"));
        String zhuom=driver.findElement( By.id("top-nav-ess-name")).getText();
        System.out.println(zhuom);
        Assertion.flag=true;
        Assertion.verifyEquals(zhuom,"桌面2");
        Assert.assertTrue(Assertion.flag);

    }
    @AfterClass
    public void beforeclose(){
        //所有浏览器执行完成之后关闭浏览器
        driver.close();
    }

}
