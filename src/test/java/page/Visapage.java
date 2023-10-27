package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/*Click on Visa option in the Home page.
 * Scroll down and select Dubai from the page.
 * Navigate back to the Home page.
 */
public class Visapage {
	WebDriver driver;
	By visa=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[6]/a");
	By dubai=By.xpath("//div[contains(text(),'Dubai')]");
	public Visapage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void visadetails() throws Exception
	{
		driver.findElement(visa).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(268,22)"," ");
		driver.findElement(dubai).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
}
