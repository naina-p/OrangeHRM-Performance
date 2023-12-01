package Performance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Tracker.MyTracker;

public class Initilization {
	
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void OpenBrowser() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		PassingCreds pc = new PassingCreds(driver);
		pc.EnterCreds();
		
		PerformanceTab pt = new PerformanceTab(driver);
		pt.ClickPerTab();
		pt.EmpReview();
		pt.PrintRecords();
		
		MyTracker mt = new MyTracker(driver);
		mt.P_TrackerTab();
	}
	
	

}
