package switching;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumUtil;

public class AsntErail extends SeleniumUtil{
	WebDriver driver;
	@Test
	public void openBrowser() {
		driver=setUp("chrome","https://erail.in/");
		String homeWinId = driver.getWindowHandle();
		System.out.println("Home Page title: "+driver.getTitle());
		clickOnElement(driver.findElement(By.xpath("//a[text()='eCatering']")));
		
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All window ids: "+allWinIds);
		allWinIds.remove(homeWinId);
		Iterator<String> itr=allWinIds.iterator();
		String childId=itr.next();
		System.out.println("Child window: "+childId);
		driver.switchTo().window(childId);
		System.out.println("Child title: "+driver.getTitle());
		waitForElement(driver.findElement(By.cssSelector("input.form-input.pl-12.pr-4")));
		clickOnElement(driver.findElement(By.cssSelector("input.form-input.pl-12.pr-4")));
		typeRequiredText(driver.findElement(By.cssSelector("input.form-input.pl-12.text-sm")),"12627");
		clickOnElement(driver.findElement(By.xpath("//button[text()='KARNATAKA EXP']")));
		clickOnElement(driver.findElement(By.cssSelector("input.custom-date-picker")));
		WebElement active= driver.switchTo().activeElement();
		active.sendKeys(Keys.chord(Keys.ARROW_DOWN));
		clickOnElement(driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")));
		driver.switchTo().activeElement().sendKeys("i",Keys.ENTER);
		clickOnElement(driver.findElement(By.xpath("//button[text()='FIND FOOD']")));
		
		List<WebElement> listitems=driver.findElements(By.cssSelector(".flex.flex-col.gap-4.pb-24>div>div>div>*:last-child>div"));
		System.out.println("NO. of elements: "+listitems.size());
		for(int i=0;i<listitems.size();i++) {
			String text= listitems.get(i).getText();
			System.out.println(text);
		}
		
		driver.switchTo().window(homeWinId);
		typeRequiredText(driver.findElement(By.id("txtStationFrom")),"Pune");
		WebElement active2= driver.switchTo().activeElement();
		active2.sendKeys(Keys.chord(Keys.ENTER));
		typeRequiredText(driver.findElement(By.id("txtStationTo")),"Bangalore");
		WebElement active1= driver.switchTo().activeElement();
		active1.sendKeys(Keys.chord(Keys.ENTER));
		clickOnElement(driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")));
		clickOnElement(driver.findElement(By.xpath("//table[tbody[tr[td[text()='May-24']]]]//tr/td[text()='9']")));
		clickOnElement(driver.findElement(By.id("buttonFromTo")));
		
		List<WebElement> trains=driver.findElements(By.cssSelector(".TrainList>tbody>tr>*:nth-child(2)"));
		System.out.println("no.of trains: "+trains.size());
		for(int j=0;j<trains.size();j++) {
			String text= trains.get(j).getText();
			System.out.println(text);
		}
		
	}
	

}
