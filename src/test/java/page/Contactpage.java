package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/*Contact page is selected from the home page.
 * Scroll down to the Leave us your Info option.
 * Enter the details and submit.
 * Navigate back to the home page.
 */
public class Contactpage {
	WebDriver driver;
	By contact=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[9]/a");
	By contactname=By.name("your-name");
	By contactemail=By.name("your-email");
	By contactsubject=By.name("your-subject");
	By contactmessage=By.name("your-message");
	By contactsubmit=By.xpath("//body/div[@id='mm-0']/div[1]/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[7]/input[1]");
	public Contactpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void contactdetails(String cname,String cemail,String csubject,String cmessage) throws Exception
	{
		driver.findElement(contact).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1250)", " ");
		driver.findElement(contactname).sendKeys(cname);
		driver.findElement(contactemail).sendKeys(cemail);
		driver.findElement(contactsubject).sendKeys(csubject);
		driver.findElement(contactmessage).sendKeys(cmessage);
		Thread.sleep(30);
		driver.findElement(contactsubmit).click();
		Thread.sleep(30);
		driver.navigate().back();
	}
}
