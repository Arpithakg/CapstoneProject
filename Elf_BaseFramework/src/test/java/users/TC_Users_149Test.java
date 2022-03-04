package users;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.EditUserPage;

/***
 * 
 * @author arpitha
 *
 */



public class TC_Users_149Test extends Base_Class {
	
	@Test
	public void CreateNewUser(){
		homePage.getUsersModuleLink().click();
		EditUserPage user=new EditUserPage(driver);
		user.getUserEdit().click();
		user.getEmail().click();
		user.getEmail().clear();
		user.getEmail().sendKeys(readFromPropertyFile.getValueProperty("EmailEdit"));
		
		user.getOkButton().click();
		user.getRadioButton().click();
		user.getClose().click();
		
		
	
	

}
}