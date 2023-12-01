package org.abstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractionMethod {
	
	WebDriver driver;
	public AbstractionMethod(WebDriver ABSdriver) {
		this.driver = ABSdriver;		
	}
	
	public void WaitUntilElementApprears(By WaitLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(WaitLocator));
	}

}
