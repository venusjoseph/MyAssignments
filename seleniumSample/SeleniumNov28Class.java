package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumNov28Class {
	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Leads")).click();
		
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//driver.findElement(By.partialLinkText("Create")).click();
		
		
		//Handling dropdown
		//Step1: Finding the element
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tata");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nick");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jane");
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		  Select dropdown1=new Select(sourceDropdown);
		  
		  
		  dropdown1.selectByIndex(4);
		  
		  WebElement sourceDropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	       Select dropdown2=new Select(sourceDropdown2);  
		   dropdown2.selectByVisibleText("Automobile");
		  
		  WebElement sourceDropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		   Select dropdown3=new Select(sourceDropdown3);  
		   dropdown3.selectByValue("OWN_CCORP");
		   
		   driver.findElement(By.className("smallSubmit")).click();
		  
		
	}

}
