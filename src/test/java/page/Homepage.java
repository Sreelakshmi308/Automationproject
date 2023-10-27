package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*Take Home page,enter keywords,destination and duration.
 * Click search button
 * Navigate back to home page
 */
public class Homepage {
	WebDriver driver;
	By keywords=By.name("tour-search");
	By destination=By.name("tax-tour-destination");
	By duration=By.name("duration");
	By search=By.xpath("//body/div[@id='mm-0']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]");
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void searchactivity(String kword) throws Exception
	{
		driver.manage().window().maximize();
		driver.findElement(keywords).sendKeys(kword);
		WebElement dest = driver.findElement(destination);
		Select destn=new Select(dest);
		destn.selectByVisibleText("Dubai");
		WebElement dur = driver.findElement(duration);
		Select durn=new Select(dur);
		durn.selectByValue("5");
		driver.findElement(search).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	

}
