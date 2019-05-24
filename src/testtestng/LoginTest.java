package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void LoginTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",".\\libs\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost:8005/");;
        driver.manage().window().maximize();
        loginpage t=new loginpage(driver);
        t.Login("hr","1");
        Thread.sleep(10000);
        String zhuom=driver.findElement( By.id("top-nav-ess-name")).getText();
        System.out.println(zhuom);
        zhuom.equals("桌面");
        driver.close();

    }
}
