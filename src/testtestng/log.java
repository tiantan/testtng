package testtestng;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class log {
	public static Logger logger;
	public log(){
		logger=Logger.getLogger("");
	}
	
	public static void info(Object message){
		logger.info(message);
		testlogoutput(message);
	}
	
	public static void testlogoutput(Object message){

		Reporter.log(message.toString());
	}
	@Test
	public void test(){
		System.out.println("test1");
		info("testtest");
		//log.logInfo("test");
	}
}


