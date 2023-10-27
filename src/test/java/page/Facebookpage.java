package page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*Select Facebook icon from Home page.
 * A new tab is opened to the Facebook page of the website.
 * Close the tab and navigate back to the Home page.
 */
public class Facebookpage {
	WebDriver driver;
	By fbicon=By.xpath("//body/div[@id='mm-0']/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]/i[1]");
	public Facebookpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void fbpage() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentwindow=driver.getWindowHandle();
		driver.findElement(fbicon).click();
		Thread.sleep(1000);
		Set<String> allwindow = driver.getWindowHandles();
		for(String handle:allwindow)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}

}
