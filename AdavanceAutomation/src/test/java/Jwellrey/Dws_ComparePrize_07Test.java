package Jwellrey;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class Dws_ComparePrize_07Test extends BaseClass{
	
	@Test
	public void prizeComparing() {
		
		jwelleryPrice.getJewelryLink().click();
		 logger.log(Status.INFO, "User click on jewelry link");
		 
		 jwelleryPrice.getPriceLink().click();
		 
		List<WebElement> allPrizes = jwelleryPrice.getAllPrizes();
		
		for(WebElement prize:allPrizes) {
			String p=prize.getText().substring(0, 3);
			int val=Integer.parseInt(p);
			if(val<=500) {
				System.out.println("testcase is passed"+prize.getText());
			}
			else {
				System.out.println("testcase is failed");
			}
			
		}
		
	}

}
