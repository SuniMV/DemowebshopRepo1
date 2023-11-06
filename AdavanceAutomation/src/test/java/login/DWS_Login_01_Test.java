package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;
import ObjectRepostiory.LoginPage;

@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_Test extends BaseClass {
	
	@Test
	public void Login_to_application_with_valid_credentials() {
		loginpage.getLoginLink().click();
		logger.log(Status.INFO, "User click on login link");
		
		
		loginpage.getEmailTF().sendKeys("selenium");
		logger.log(Status.INFO, "User Entred Email Address");
		
		loginpage.getPasswordTF().sendKeys("1234");
		logger.log(Status.INFO, "User Entered Password");
		
		loginpage.getLoginButton().click();
		
	}

}
