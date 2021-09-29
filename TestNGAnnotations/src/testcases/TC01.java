package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.PrePostConditions;

public class TC01 extends PrePostConditions {
//	@Parameters({"searchValue","id"})
	@Test(dataProvider="data")
	public void ebaypage( String id,String searchValue) {

		WebElement searchBox = driver.findElement(By.id(id));
		searchBox.sendKeys(searchValue);
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		searchBtn.click();

	}
	
	@DataProvider(name="data")
	public Object[][] testData()
	{
		
		Object[][] arr=new Object[3][2];
		
		arr[0][0]="gh-ac";
		arr[0][1]="Laptops";
		
		arr[1][0]="gh-ac";
		arr[1][1]="Mobiles";
		
		arr[2][0]="gh-ac";
		arr[2][1]="Bags";
		
		return arr;
		
	}
	
	
	
	
}
