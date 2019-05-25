package testtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

//时间等待类方法
public class wait {
    private WebDriver driver;

    public wait(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//当指定元素没有立即出现时，它会在指定时间范围内，10ms进行一次查找，超出指定时间，则抛出异常

    //用于判断时间元素是否出现，如果没有出现等待10s，//元素隐藏的去掉，只显示displayed的元素对象，只获取显示元素可点击
    public boolean waitToDisplayed(final By key){
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



