 package users;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.UserCreatePage;

/***
 * 
 * @author arpitha
 *
 */


public class TC_Users_146Test extends Base_Class {


	@Test
	public void CreateNewUser() throws InterruptedException{
		homePage.getUsersModuleLink().click();
		UserCreatePage User = new UserCreatePage(driver);
		User.getClickOnPlus().click();
		
		System.out.println(readFromPropertyFile.getValueProperty("FirstName"));
		Thread.sleep(3000);
		User.getFirstNameTextField().sendKeys(readFromPropertyFile.getValueProperty("FirstName"));
		System.out.println(readFromPropertyFile.getValueProperty("LastName"));
		User.getLastNameTextField().sendKeys(readFromPropertyFile.getValueProperty("LastName"));
		User.getEmailTextField().sendKeys(readFromPropertyFile.getValueProperty("Email"));
	   User.getDepartmentdropdown().click();
		User.getProduct().click();
		User.getCalanderclick().click();
		User.getCalenderDate().click();
	
		User.getSave().click();
	User.getOk().click();
	User.getClose().click();

		
		}
}