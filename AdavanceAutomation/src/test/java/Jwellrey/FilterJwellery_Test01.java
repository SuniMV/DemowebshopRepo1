package Jwellrey;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class FilterJwellery_Test01 extends BaseClass{
	
	@Test
	
	public void Fiter_JwelleryPrice() throws InterruptedException {
		 jwelleryPrice.getJewelryLink().click();
		 logger.log(Status.INFO, "User click on jewelry link");
		 
		 jwelleryPrice.getPriceLink().click();
		 Thread.sleep(2000);
		String price= jwelleryPrice.getOwnJwellaryLink().getText();
		System.out.println(price);
		
		String l = "";
		for(int i=0;i<price.length()-3;i++)
		{
			l=l+price.charAt(i);
		}
		System.out.println(l);
		System.out.println(Integer.parseInt(l));
		
	}
	

}
