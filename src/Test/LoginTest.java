package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import testtestng.Assertion;
import testtestng.loginpage;
import testtestng.opendriver;

public class LoginTest extends opendriver {
    // public WebDriver driver;
    //每一个测试用例都是继承这个,就可以不用重复写这个方法

   /* @BeforeSuite
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
    @AfterClass
    public void beforeclose(){
        //所有浏览器执行完成之后关闭浏览器
        driver.close();
    }
*/


    @Test
    public void LoginTest() throws InterruptedException {
        loginpage t=new loginpage(driver);

        t.Login("hr","123456");
        // Thread.sleep(10000);
        t.waitToDisplayed(By.id("top-nav-ess-name"));
        String zhuom=driver.findElement( By.id("top-nav-ess-name")).getText();
        System.out.println(zhuom);
        Assertion.flag=true;
        Assertion.verifyEquals(zhuom,"桌面2");
        Assert.assertTrue(Assertion.flag);

    }
}




