package package2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class3 {
	
	@Test(groups="two")
	public void tc3() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BRUBRU\\Documents\\Qtree_Java training\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
         List<WebElement>  l = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
		
		for (WebElement x: l) {
			
			x.click();
			Thread.sleep(3000);
			
			}
		Thread.sleep(3000);
		
		ob.quit();
		
	}

}
