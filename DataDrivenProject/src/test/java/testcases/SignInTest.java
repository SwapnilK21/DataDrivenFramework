package testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.actions.SigninPage;
import utilities.Utilities;

import base.Base;

public class SignInTest {

	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void signInTest(Hashtable<String,String> data) {
		
		if(data.get("runmode").equalsIgnoreCase("N")){
			
			throw new SkipException("Skipping the test as the Run mode is NO");
			
			
		}
		Base.initConfiguration();
		SigninPage signin = Base.topNav.gotoSignIn();
		signin.doLogin(data.get("username"), data.get("password"));
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		if(Base.driver!=null){
		Base.quitBrowser();
		}
	}
}
