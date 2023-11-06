package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_Login_02_TestWithDataProvider extends BaseClass  {

	@Test(dataProvider = "data",dataProviderClass = ExcelUtility.class)
	public void Login_to_application_with_valid_credentials(String email,String password) {
		loginpage.getLoginLink().click();
		logger.log(Status.INFO, "User click on login link");


		loginpage.getEmailTF().sendKeys(email);
		logger.log(Status.INFO, "User Entred Email Address");

		loginpage.getPasswordTF().sendKeys(password);
		logger.log(Status.INFO, "User Entered Password");

		
		loginpage.getLoginButton().click();

	}
}

