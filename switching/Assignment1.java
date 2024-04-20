package switching;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		Actions action =new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//li[text()='Item 1']"));
		action.dragAndDropBy(src, 0,300).build().perform();
	}


}


//public void Sortable() {
//WebDriver driver=setUp("chrome", "https://jqueryui.com/");
// clickOnElement(driver.findElement(By.xpath("//a[text()='Sortable']")));
// driver.switchTo().frame(0);
// WebElement src=driver.findElement(By.xpath("//li[text()='Item 6']"));
// WebElement target=driver.findElement(By.xpath("//li[text()='Item 2']"));
// action.dragAndDropBy(src, 0,100).build().perform();
// WebElement src1=driver.findElement(By.xpath("//li[text()='Item 7']"));
// WebElement target1=driver.findElement(By.xpath("//li[text()='Item 3']"));
// action.dragAndDrop(src1, target1).build().perform();
//
//}