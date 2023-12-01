package Tracker;

import org.abstractComponent.AbstractionMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTracker extends AbstractionMethod {
	
	WebDriver driver;
	public MyTracker(WebDriver Trackdriver) {
		super(Trackdriver);
		this.driver = Trackdriver;		
	}
	
	By Track = By.xpath("//a[@class=\"oxd-topbar-body-nav-tab-item\"]");
	By RecordList = By.xpath("//span[@class=\"oxd-text oxd-text--span\"]");
	
	public void P_TrackerTab() {
		
		WaitUntilElementApprears(Track);
		driver.findElement(By.xpath("//a[@class=\"oxd-topbar-body-nav-tab-item\"]")).click();
		
		WaitUntilElementApprears(RecordList);
		System.out.println(driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--span\"]")).getText());
		
		
	}

}
