package Mindtree.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		//driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@class='right1 mobile-right destination'] //a[@value='MAA']")).click();
		driver.findElement(By.id("custom_date_picker_id_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
		}
		else
		{
			System.out.println("its disabled");
			
		}
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
	
		driver.findElement(By.cssSelector("input[type='submit']")).click();		
	}  
}
