package Jwellrey;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_AddJwrly_WishList_08Test09 extends BaseClass {

	@Test

	public void AddToWishList_Jwellery() throws InterruptedException {
		addToWishList.getJewelryLink().click();
		logger.log(Status.INFO, "User click on jewelry link");

		addToWishList.getWhiteDiamond().click();
		logger.log(Status.INFO, "User click on whiteDiamondJwellery");

		addToWishList.getWishList().click();
		logger.log(Status.INFO, "User click on wishlist link");
		Thread.sleep(3000);
		String msg = addToWishList.getMessages().getText();

		System.out.println(msg);
		Thread.sleep(2000);
	}
@Test
	public void RemoveToWishList_Jwellery() throws InterruptedException {
		addToWishList.getWishListAdd().click();
		logger.log(Status.INFO, "User added on jewelry in wishlist");

		addToWishList.getCheckBoxclick().click();
		logger.log(Status.INFO, "User click on checkbox");

		addToWishList.getUpdateWishlist().click();
		logger.log(Status.INFO, "User click on updatedwishList");
		Thread.sleep(5000);
	}

}
