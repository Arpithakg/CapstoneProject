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


public class UserCreatePage {
	
	public UserCreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement clickOnUser;

	public WebElement getClickOnUser() {
		return clickOnUser;
	}
	
	@FindBy(xpath="//div[text()='New User']")
	private WebElement ClickOnPlus;

	public WebElement getClickOnPlus() {
		return ClickOnPlus;
	}
	
	@FindBy(id="createUserPanel_firstNameField")
	private WebElement firstNameTextField;

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	@FindBy(id="createUserPanel_lastNameField")
	private WebElement lastNameTextField;

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	@FindBy(id="createUserPanel_emailField")
	private WebElement emailTextField;

	public WebElement getEmailTextField() {
		return emailTextField;
	}
	
	@FindBy(xpath="(//div[text()='-- department not assigned --'])[1]")
	private WebElement departmentdropdown;
	
	
	public WebElement getDepartmentdropdown() {
		return departmentdropdown;
	}

	@FindBy(xpath="//div[text()='Production' and @class='item']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}

	@FindBy(id="createUserPanel_hireDatePlaceholder")
	private WebElement Calanderclick;
	
	
	public WebElement getCalanderclick() {
		return Calanderclick;
	}

	@FindBy(xpath="//button[text()='March 2022']/../../../../../../../..//span[text()='4']")
	private WebElement calenderDate;

	public WebElement getCalenderDate() {
		return calenderDate;
	}

	@FindBy(xpath="//div[@class='components_switcher small off animated']")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	
	@FindBy(xpath="(//span[@class=\"ui-button-text\"])[7]")
	private WebElement ok;

	public WebElement getOk() {
		return ok;
	}

	@FindBy(xpath="(//span[text()='Close'])[1]")
	private WebElement close;

	public WebElement getClose() {
		return close;
	}
	
	
}
	
	

	

	

