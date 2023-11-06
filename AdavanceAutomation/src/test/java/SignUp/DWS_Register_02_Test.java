package SignUp;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ITestListenerUtility;
import ObjectRepostiory.SignUpPage;
@Listeners(ITestListenerUtility.class)


public class DWS_Register_02_Test extends BaseClass{
	
  @Test
   public void Register_to_application_with_valid_credentials() {
	   signUpPage.getRegisterLink().click();
	   logger.log(Status.INFO, "User click on Register link");
	   
	   signUpPage.getGenderCheckBox().click();
	   logger.log(Status.INFO, "User click gender link");
	   
	   signUpPage.getFirstNameLink().sendKeys("Madhuri");
	   logger.log(Status.INFO, "User Entered firstName");
	   
	   signUpPage.getLastNameLink().sendKeys("kumari");
	   logger.log(Status.INFO, "User Entered LastName");
	   
	   signUpPage.getEmailLink().sendKeys("kmadhuri645@gmail.com");
	   logger.log(Status.INFO, "User Entered Email");
	   
	   signUpPage.getPasswordLink().sendKeys("12345");
	   logger.log(Status.INFO, "User Entered Password");
	   
	   signUpPage.getConfirmPassworddLink().sendKeys("12345");
	   logger.log(Status.INFO, "User Entered Email");
	   
	   signUpPage.getRegisterbuttonLink().click();
	   
  }
	

}