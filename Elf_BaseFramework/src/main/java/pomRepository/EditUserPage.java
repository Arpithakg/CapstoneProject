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


public class EditUserPage {
	
	public EditUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Alvarez, Daniel']")
	private WebElement userEdit;
	public WebElement getUserEdit() {
		return userEdit;
	}
	
	@FindBy(xpath="//input[@id='editUserPanel_emailField']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath="//div[@id='editUserPanel_accessToOtherProductSelectorPlaceholder']")
	private WebElement radioButton;
	public WebElement getRadioButton() {
		return radioButton;
	}
	@FindBy(xpath="(//div[@class='components_button okButton'])[1]")
	private WebElement  okButton;
	public WebElement getOkButton() {
		return okButton;
	}
	@FindBy(xpath="//div[@class='hideButton_panelContainer']")
	private WebElement close;
	public WebElement getClose() {
		return close;
	}
}
