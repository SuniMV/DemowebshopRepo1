package AddToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_AddToCart_03_OR_04 extends BaseClass{
	
	@Test(groups="IT")
	public void  AddToCart_ProductWith_homePage() throws InterruptedException {
		Thread.sleep(3000);
		addToCart.getProductLink().click();
		logger.log(Status.INFO, "User click on products");
		Thread.sleep(3000);
		addToCart.getClickAddButton().click();
		logger.log(Status.INFO, "User click on addButton");
		Thread.sleep(3000);
	}
//********************************************************	
	@Test
	public void  Add_Books_InToCart_() throws InterruptedException {
		addToCart.getBooksLink().click();
		logger.log(Status.INFO, "User click on books");
		Thread.sleep(3000);
		
		addToCart.getAddToCartButton().click();
		logger.log(Status.INFO, "User click on addButtons");
		Thread.sleep(3000);
		
	}
}
