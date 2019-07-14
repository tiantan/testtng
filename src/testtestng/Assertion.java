package testtestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
	//断言的方法，用于就算断言失败用例能继续执行下去
	public static boolean flag=true;
	public  static void begin(){
		flag=true;
	}
	public  static void end(){
		Assert.assertTrue(flag);
	}
	public static void verifyEquals(Object actual,Object expected){
		try{
		Assert.assertEquals(actual, expected);
		}catch(Error e){
		   flag=false;
		}
	}
	public static void verifyEquals(Object actual,Object expected,String message){
		try{
		Assert.assertEquals(actual, expected, message);
		}catch(Error e){
			e.printStackTrace();
			Reporter.log(message);
			System.out.println(message);
		   flag=false;
		}
	}

	//用于测试
	@Test
	public void test1(){
		Assertion.begin();
		Assertion.verifyEquals("test","test1","testtt");
		Assertion.end();
	}
}
