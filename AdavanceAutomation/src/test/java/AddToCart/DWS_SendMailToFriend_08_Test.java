package AddToCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_SendMailToFriend_08_Test extends BaseClass {
	
	@Test
	public void sendingEmail_To_Friend() throws InterruptedException {
		sendMail.getProductLink().click();
		logger.log(Status.INFO, "User click on products");
		
		sendMail.getEmailFriend().click();
		logger.log(Status.INFO, "User click on Email A Friend");
		
		sendMail.getFriendEmailTextField().sendKeys("abc@gmail.com");
		logger.log(Status.INFO, "User send mail on friendEmailAddress");
		
		sendMail.getYourEmailAddress().sendKeys("madhu@gmail.com");
		logger.log(Status.INFO, "User send mail on yourEmailAddress");
		
		sendMail.getPersonalMessageTextField().sendKeys("hello");
		logger.log(Status.INFO, "User write some text on messageTextField");
		
		sendMail.getSendMail().click();
		logger.log(Status.INFO, "User click on sendMail button User click on sendMail button");
		
		Thread.sleep(5000);
		String errorMsg = sendMail.getErrorMessage().getText();
		System.out.println(errorMsg);
		System.out.println("hello");
		
		
	}
	
	

}
