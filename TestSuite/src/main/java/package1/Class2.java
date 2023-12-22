package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups="one")
	public void tc2(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BRUBRU\\Documents\\Qtree_Java training\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://google.com");
		ob.get("https://facebook.com");
		
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.URL"));
		
		//other way
		String c = ob.getCurrentUrl();
		System.out.println(c);
		System.out.println(ob.getTitle());
		
		
		
		ob.quit();
		
	}

}
