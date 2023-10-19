package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Careworld {
	WebDriver driver;
	By mouse=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[2]/a");
	By aboutus=By.xpath("//header/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
	By world=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[3]/a");
	By europe=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[3]/ul/li[5]/a");
	By nextpage=By.xpath("//*[@id=\"traveltour-page-wrapper\"]/div/div/div/div/div/div/div[2]/a[3]");
	public Careworld(WebDriver driver)
	{
		this.driver=driver;
	}
	public void about() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement mouseelement = driver.findElement(mouse);
		Actions act=new Actions(driver);
		act.moveToElement(mouseelement).perform();
		driver.findElement(aboutus).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	public void world() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement worldelement = driver.findElement(world);
		Actions act=new Actions(driver);
		act.moveToElement(worldelement).perform();
		driver.findElement(europe).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(1330,21)"," ");
		Thread.sleep(2000);
		driver.findElement(nextpage).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}

}
