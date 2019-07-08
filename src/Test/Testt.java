package Test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testt {
    //// 设置打开的浏览器的屏幕大小,模拟手机屏幕.场景用于浏览器访问移动端
    public WebDriver driver;
    @BeforeSuite
    public void setup(){
        //用于第一次启动浏览器
        //66
        //System.setProperty("webdriver.gecko.driver",".\\libs\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver",".\\libs\\chromedriver69.exe");
        //WebDriver driver=new FirefoxDriver();
        // 声明ChromeOptions,主要是给Chrome设置参数.
         ChromeOptions chromeOptions = new ChromeOptions();
        // 设置user agent的参数为iPhone 6
        chromeOptions.addArguments("--user-agent=iPhone 6");
         driver = new ChromeDriver(chromeOptions);
        // 设置打开的浏览器的屏幕大小,模拟手机屏幕.
        driver.manage().window().setSize(new Dimension(600, 900));
        driver.get("https://meitaichina.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
    @Test
    public  void Test(){
        System.out.println("test");
    }
    @AfterClass
    public void beforeclose(){
        //所有浏览器执行完成之后关闭浏览器
        driver.close();
    }
}
