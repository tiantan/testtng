package testtestng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends opendriver {
   // public WebDriver driver;
    loginpage t=new loginpage(driver);
    @Test
    public void LoginTest() throws InterruptedException {

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
