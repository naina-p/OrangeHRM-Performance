package Performance;

import org.abstractComponent.AbstractionMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassingCreds extends AbstractionMethod{
	
	WebDriver driver;
	public PassingCreds(WebDriver PCdriver) {
		super(PCdriver);
		this.driver = PCdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement UserName;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement PassWord;
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	WebElement LoginButton;
	
	By EnterUser = By.xpath("//input[@name=\"username\"]");
	
	public void EnterCreds() {
		
		WaitUntilElementApprears(EnterUser);
		UserName.sendKeys("Admin");
		PassWord.sendKeys("admin123");
		LoginButton.click();
	}

	
	

}
