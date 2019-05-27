package testtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class opendriver {
    //每一个测试用例都是继承这个,就可以不用重复写这个方法
    public WebDriver driver;
    @BeforeSuite
    public void setup(){
        //用于第一次启动浏览器
        //66
        //System.setProperty("webdriver.gecko.driver",".\\libs\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver",".\\libs\\chromedriver69.exe");
        //WebDriver driver=new FirefoxDriver();
        driver=new ChromeDriver();
        // driver.get("http://localhost:8005/");
        driver.get("http://cloud.hrsoft.com.cn/intest/login.html?r=0.8770877012611458");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void beforeclose(){
        //所有浏览器执行完成之后关闭浏览器
        driver.close();
    }
}
