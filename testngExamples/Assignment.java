package testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SeleniumUtil;

public class Assignment extends SeleniumUtil {

	WebDriver driver;

	@BeforeMethod
	public void login() {
		System.out.println("Login with valid data");
		typeRequiredText(driver.findElement(By.name("username")), "Admin");
		typeRequiredText(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout from the application");
		clickOnElement(driver.findElement(By.cssSelector("span.oxd-userdropdown-tab")));
		clickOnElement(driver.findElement(By.cssSelector("ul.oxd-dropdown-menu>li:nth-child(4)>a")));
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Close the browser instance");
		driver.close();
	}

	@Test(priority = 1)
	public void ohrm_PIM_Creation() {
		System.out.println("Write code to create PIM");
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
		typeRequiredText(driver.findElement(By.cssSelector("input.oxd-input.orangehrm-firstname")), "Tester");
		typeRequiredText(driver.findElement(By.cssSelector("input.oxd-input.orangehrm-lastname")), "Qa");
		typeRequiredText(driver.findElement(By.cssSelector(".oxd-grid-2>div>div>div>input")), "0348");
		clickOnElement(driver.findElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));

	}

	@Test(priority = 2)
	public void ohrm_PIM_update() {
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		typeRequiredText(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/form/div/div/div[1]/div/div[2]/div/div/input[1]")),"Tester Qa");
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[2]")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Job']")));
		clickOnElement(driver.findElement(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div/div")));
		driver.switchTo().activeElement().sendKeys("q", Keys.DOWN);
		clickOnElement(driver.findElement(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div/div")));
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		typeRequiredText(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/form/div/div/div[1]/div/div[2]/div/div/input[1]")),"Tester Qa");
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));

	}

	@Test(priority=3)
	public void ohrm_PIM_delete() {
		System.out.println("Write code to delete PIM");
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		typeRequiredText(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/form/div/div/div[1]/div/div[2]/div/div/input[1]")),"Tester Qa");
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]//label")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-button--label-danger ")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-button--label-danger.orangehrm-button-margin")));
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("open browser and enter orangehrm url");
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
