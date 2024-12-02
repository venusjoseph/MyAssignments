package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
		        //Maximize the Browser
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
				//Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click the login button
				driver.findElement(By.className("decorativeSubmit")).click();
			
			    //Click the CRMSFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click Leads link
				driver.findElement(By.linkText("Accounts")).click();
				
				//Click create lead
				driver.findElement(By.linkText("Create Account")).click();
				driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester sample");
				
			
						
			   WebElement sourceDropdown1 = driver.findElement(By.name("industryEnumId"));
			   Select dropdown1=new Select(sourceDropdown1);  
			   dropdown1.selectByValue("IND_SOFTWARE");
			  
			   WebElement sourceDropdown2 = driver.findElement(By.name("ownershipEnumId"));
			   Select dropdown2=new Select(sourceDropdown2);  
			   dropdown2.selectByVisibleText("S-Corporation");
			  
			   WebElement sourceDropdown3 = driver.findElement(By.id("dataSourceId"));
			   Select dropdown3=new Select(sourceDropdown3);  
			   dropdown3.selectByValue("LEAD_EMPLOYEE");
			   
			   WebElement sourceDropdown4 = driver.findElement(By.id("marketingCampaignId"));
			   Select dropdown4=new Select(sourceDropdown4);  
			   dropdown4.selectByIndex(6);
			   
			   WebElement sourceDropdown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
			   Select dropdown5=new Select(sourceDropdown5);  
			   dropdown5.selectByValue("TX");
				  
				 driver.findElement(By.className("smallSubmit")).click();

	}
	

}
