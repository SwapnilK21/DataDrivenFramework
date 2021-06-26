package testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import errorcollectors.ErrorCollector;
import pages.actions.HomePage;
import utilities.Utilities;

public class FlightSearchTest {
	
	@BeforeTest
	public void setUp(){
		
		Base.initConfiguration();
	}
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void flightSearchTest(Hashtable<String,String> data) {
		
		
		System.out.println("Printing no of adults and children : "+data.get("noOfAdults")+"---"+ data.get("noOfChildern"));
		
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(), 7);
	/*	ErrorCollector.verifyEquals(home.findTabCount(), 6);
		ErrorCollector.verifyEquals(home.findTabCount(), 7);
		ErrorCollector.verifyEquals(home.findTabCount(), 8);
*/		ErrorCollector.verifyEquals(home.findTabCount(), 7);
		home.gotoFlights().bookAFlight(data.get("fromCity"), data.get("toCity"), data.get("fromDate"), data.get("toDate"), data.get("noOfAdults"), data.get("noOfChildern"));
		
		
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		if(Base.driver!=null){
		Base.quitBrowser();
		}
	}
	

}
