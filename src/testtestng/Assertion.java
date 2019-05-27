package testtestng;

import org.testng.Assert;

public class Assertion {
	//断言的方法，用于就算断言失败用例能继续执行下去
	public static boolean flag=true;
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
		   flag=false;
		}
	}
}
