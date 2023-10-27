package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*From home page mouse is placed in the gallery option.
 * Then,click on the photos and the web page is navigated to the photos page.
 * Scroll down.No photos are clicked since the web page is an active one,so one photo selected today might not be seen tomorrow.
 * Go back to the home page.
 */
public class Gallerypage {
	WebDriver driver;
	By gallery=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[8]/a");
	By photo=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[8]/ul/li[1]/a");
	By video=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[8]/ul/li[2]/a");
	public Gallerypage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void galleryview() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement gallerys = driver.findElement(gallery);
		Actions act=new Actions(driver);
		act.moveToElement(gallerys).perform();
		driver.findElement(photo).click();
		Thread.sleep(30);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1250)"," ");
		Thread.sleep(30);
		driver.navigate().back();
		Thread.sleep(30);
	}
}
