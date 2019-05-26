package testtestng;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class test {

	@Test
	public void test1(){
		System.out.println("test1");
		//Assert.assertEquals(1, 2);
		Assertion.flag=true;
		Assertion.verifyEquals(1, 2,"testesttest");
		System.out.println("test23");
		Assert.assertTrue(Assertion.flag);
	}
	@Test
	public void test2(){

		System.out.println("test2");
	}
	
	@DataProvider
	public Object[][] logindata(){
		return new Object[][]{{"a"},{"b"}};
		 
	}/*
	@Test(dataProvider="logindata")
	public void test(String info){
		System.out.println(info);
	}*/
	
	
}
