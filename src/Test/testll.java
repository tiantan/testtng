package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import testtestng.Assertion;

public class testll {

   /* public static void main(String[] args) {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        try{
                Assert.assertEquals("test","test2");
        } catch (Error e){
            e.printStackTrace();
            System.out.println("test");
        }
    }*/
   @Test
    public void test1(){
       Assertion.begin();
       Assertion.verifyEquals("test","test","TEST");
       Assertion.end();
       Reporter.log("成功");//最后加上日志输出
    }
    @Test
    public void test2(){
        try{
            Assert.assertEquals("test","test");
            System.out.println("成功2");
        } catch (Error e){
            e.printStackTrace();
            System.out.println("失败2");
        }
    }
}
