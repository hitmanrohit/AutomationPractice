package testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtil;

public class vtiger extends SeleniumUtil{
	
	@Test
	public void Vtiger() {
		// opening browser
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

		// login
		typeRequiredText(driver.findElement(By.id("username")), "admin");
		typeRequiredText(driver.findElement(By.id("password")), "admin");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
		System.out.println(driver.getTitle());

		// PIM create
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator>div>span")));
		clickOnElement(driver.findElement(By.id("MARKETING_modules_dropdownMenu")));
		clickOnElement(driver.findElement(By.xpath("//li/a[@title='Leads']")));
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		typeRequiredText(driver.findElement(By.id("Leads_editView_fieldName_lastname")), "Tester");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickOnElement(driver.findElement(By.xpath("//h4[text()=' Leads ']")));
//		String expectedLastname="Tester";
//		String actualLastname= getTextFromElement(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span/span/a")));
//		Assert.assertEquals(expectedLastname, actualLastname);
		

		// Pim update
		clickOnElement(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/span/input")));
		clickOnElement(driver.findElement(By.id("Leads_listView_massAction_LBL_EDIT")));
		typeRequiredText(driver.findElement(By.id("Leads_editView_fieldName_firstname")),"QA");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
//		String expectedfirstname="QA";
//		WebElement firstname =driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span/span/a"));
//		try {
//			String actualfirstname= getTextFromElement(firstname);
//		}
//		catch(StaleElementReferenceException e){
//	    firstname =driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span/span/a"));
//		String actualfirstname= getTextFromElement(firstname);
//		Assert.assertEquals(expectedfirstname, actualfirstname);
//		}
		
		
		//delete
		try {
			clickOnElement(driver.findElement(By.xpath("//span[@class='input']/input")));
		}
		catch(StaleElementReferenceException e) {
			WebElement check=driver.findElement(By.xpath("//span[@class='input']/input"));
			clickOnElement(check);
		}
		clickOnElement(driver.findElement(By.id("Leads_listView_massAction_LBL_DELETE")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
	

	}
}
