package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.MoveDeleteDepartmentPage;

/***
 * 
 * @author arpitha
 *
 */



public class TC_Users_148Test extends Base_Class{
	
	@Test
	public void MoveDeleteDepartment(){
		homePage.getUsersModuleLink().click(); 
		MoveDeleteDepartmentPage department=new MoveDeleteDepartmentPage(driver);
		department.getUserPlus().click();
		department.getFirstname1().sendKeys(readFromPropertyFile.getValueProperty("FirstName1"));
		department.getLastname1().sendKeys(readFromPropertyFile.getValueProperty("LastName1"));
		department.getEmail1().sendKeys(readFromPropertyFile.getValueProperty("Mail1"));
		
		department.getFirstname2().sendKeys(readFromPropertyFile.getValueProperty("FirstName2"));
		department.getLastName2().sendKeys(readFromPropertyFile.getValueProperty("LastName2"));
		department.getEmail2().sendKeys(readFromPropertyFile.getValueProperty("Email2"));
		department.getSendButton().click();
		department.getCloselink().click();
		
		
		

	}
}
