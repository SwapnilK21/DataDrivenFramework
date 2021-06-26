package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import utilities.TestUtil;

public class Test1 {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void test1(Hashtable<String,String> data) {
		
		System.out.println(data.get("Ref_ID"));
		System.out.println(data.get("Security"));
		System.out.println(data.get("Buy_Sell"));
		System.out.println(data.get("Settlement_Date"));
		System.out.println(data.get("Trade_Date"));
		System.out.println(data.get("Commission"));
		System.out.println(data.get("Commission_Type"));
		System.out.println(data.get("Quantity"));
		System.out.println(data.get("Price"));
		System.out.println("\n===============================================\n");
		
	}

}
