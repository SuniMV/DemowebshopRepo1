package AddToCart;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_RemoveToCompareList_06Test extends BaseClass {
	
	@Test
	public void Add_ToCampareList_Computors() throws InterruptedException {
		
		campareList.getComputorsLink().click();
		 logger.log(Status.INFO, "User click on Computors link");
		 
		 campareList.getDesktopsLink().click();
		 logger.log(Status.INFO, "User click on Desktops link");
		 
		 campareList.getAddToCartLink().click();
		// logger.log(Status.INFO, "User click on AddToCartLink link");
		
		 campareList.getAddToCompareList().click();
		 logger.log(Status.INFO, "User click on AddToCompareLink link");
		 
		 Thread.sleep(2000);
		 
		 campareList.getComputorsLink1().click();
		 logger.log(Status.INFO, "User click on Computors link");
		 
		 campareList.getDesktopsLink1().click();
		 logger.log(Status.INFO, "User click on Desktops link");
		 
		 campareList.getAddToCartLink1().click();
		// logger.log(Status.INFO, "User click on AddToCartLink link");
		
		 campareList.getAddToCompareList1().click();
		 logger.log(Status.INFO, "User click on AddToCompareLink link");
		// Thread.sleep(2000);
		 
		 
		removeList.getRemoveToCompareList1().click();
		 Thread.sleep(2000);
		removeList.getRemoveToCompareList2().click();
		 
		 
	}
}
