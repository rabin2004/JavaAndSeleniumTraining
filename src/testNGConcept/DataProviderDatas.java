package testNGConcept;

import org.testng.annotations.DataProvider;

public class DataProviderDatas {

	//Data in separate class
	
	@DataProvider(name="SignOnData")
	public Object[][] getSignOnData(){
		Object[][] data = {{"abc","123"},{"test123","123"},{"test","123"}};
		return data;
	}
	
	@DataProvider(name="RegisterData")
	public Object[][] getRegisterData(){
		Object[][] data = {{"tom","tom123"},{"harry", "harry123"}};
		return data;
	}
}
