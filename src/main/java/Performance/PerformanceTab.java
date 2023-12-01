package Performance;

import org.abstractComponent.AbstractionMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformanceTab extends AbstractionMethod{
	
	WebDriver driver;
	public PerformanceTab(WebDriver PTdriver) {
		super(PTdriver);
		this.driver = PTdriver;
		PageFactory.initElements(driver, this);
	}
	
	By PerforTab = By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[7]");
	
	public void ClickPerTab() {
		WaitUntilElementApprears(PerforTab);
		driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[7]")).click();
		WaitUntilElementApprears(PerforTab);
	}
	
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	WebElement SearchButton;
	@FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span\"]")
	WebElement WebText;
	
	By EmpNameTxtBox = By.xpath("//input[@placeholder=\"Type for hints...\"]//parent::div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]");
	By WebTxtBox = By.xpath("//span[@class=\"oxd-text oxd-text--span\"]");
			
	public void EmpReview() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]//child::input[@placeholder=\"Type for hints...\"]")).sendKeys("Ravi");
		 Thread.sleep(3000);
		 SearchButton.click();
		 
	}
	
	public void PrintRecords() {
		WaitUntilElementApprears(WebTxtBox);
		System.out.println(WebText.getText());
	}
}







