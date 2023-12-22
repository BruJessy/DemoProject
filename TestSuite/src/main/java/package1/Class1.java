package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups="one")
	public void tc1() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BRUBRU\\Documents\\Qtree_Java training\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob = new ChromeDriver();
	    ob.get("https://google.com");
	    ob.manage().window().maximize();
	    
	  WebElement ele = ob.findElementByName("q");
	  ob.findElementByName("q").sendKeys("Selenium"); //#2
	  File f1=ob.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f1, new File("C:\\Users\\BRUBRU\\Documents\\Selenium Automation\\Practise\\TestSuite\\src\\main\\java\\package1\\screenshot1.png" ));
	  
	   Actions ac = new Actions(ob);
	   //ac.click(ele).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	   //ac.sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	   ac.sendKeys(Keys.ENTER).build().perform(); //#2
	   
	   
	    File f = ob.getScreenshotAs(OutputType.FILE);
	    //Fileutils class will provide copy paste optio 
	    //for that we need to download apache directory studio common io file from mvnrepository
	    
	    FileUtils.copyFile(f, new File("C:\\Users\\BRUBRU\\Documents\\Selenium Automation\\Practise\\TestSuite\\src\\main\\java\\package1\\screenshot.png" ));
	    ob.quit();
		
	}

}
