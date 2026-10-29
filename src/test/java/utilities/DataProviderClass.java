package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider
	public Object[][] positiveLoginData(){
		return new Object[][] {
							   {"student@qa.test","Password123"},
							   {"a@a.com","sdasdas"},
							   {"",""}
							   };
	}
	
	@DataProvider
	public Object[][] negativeLoginData(){
		return new Object[][] {
							   {"stuerwesdent@qa.test","Password123"},
							   {"afsdfsdfs@afsdsd.com","sdasdrewas"},
							   {"fdasfsa","ffere"}
							   };
	}
}
