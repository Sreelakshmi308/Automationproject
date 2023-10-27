package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
/*Careers page is selected from the home page and scrolled down to enter the Join Our Team with data.
 * Here name,email,contact number and position is given.
 * Your cv field has bugs in it and is not working.
 * Hence,it is not possible to upload cv and so submit button is also showing error.
 */
public class Careerpage {
	WebDriver driver;
	By career=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[7]/a");
	By yourname=By.name("your-name");
	By youremail=By.name("your-email");
	By yourcontact=By.xpath("//body/div[@id='mm-0']/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[4]/label[1]/span[1]/input[1]");
	By yourposition=By.name("your-position");
	public Careerpage(WebDriver driver)//constructor
	{
		this.driver=driver;
	}
	public void tocareer(String yname,String yemail,String ycontact,String yposition) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(career).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1300)", " ");
		driver.findElement(yourname).sendKeys(yname);
		driver.findElement(youremail).sendKeys(yemail);
		driver.findElement(yourcontact).sendKeys(ycontact);
		driver.findElement(yourposition).sendKeys(yposition);
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
