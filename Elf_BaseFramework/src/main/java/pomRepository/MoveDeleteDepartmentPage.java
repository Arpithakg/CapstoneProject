package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author arpitha
 *
 */


public class MoveDeleteDepartmentPage {
	public MoveDeleteDepartmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='components_button addSeveralUsersButton']")
	private WebElement userPlus;
	public WebElement getUserPlus() {
		return userPlus;
	}
	
	@FindBy(xpath="(//input[@placeholder='First Name'])[4]")
	private WebElement firstname1;
	public WebElement getFirstname1() {
		return firstname1;
	}
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder lastNameCell']")
	private WebElement lastname1;
	public WebElement getLastname1() {
		return lastname1;
	}

	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder emailCell']")
	private WebElement email1;
	public WebElement getEmail1() {
		return email1;
	}
	@FindBy(xpath="(//input[@placeholder='First Name'])[5]")
	private WebElement firstname2;
	public WebElement getFirstname2() {
		return firstname2;
	}
	
	@FindBy(xpath="(//input[@placeholder='Last Name'])[5]")
	private WebElement lastName2;
	
	
	public WebElement getLastName2() {
		return lastName2;
	}
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder emailCell'])[2]")
	private WebElement email2;
	public WebElement getEmail2() {
	return email2;
}
	@FindBy(xpath="//span[text()='Send Invitations']")
	private WebElement sendButton;
	public WebElement getSendButton() {
		return sendButton;
	}
	
	@FindBy(xpath="(//div[@class=\"closeLink\"])[2]")
	private WebElement closelink;
	public WebElement getCloselink() {
		return closelink;
	}

//@FinaBy(xpath="//span[text()='Send Invitations']")
//private WebElement sendButoon;
}
