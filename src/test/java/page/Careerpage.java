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

public class Careerpage {
	WebDriver driver;
	By career=By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[7]/a");
	By yourname=By.name("your-name");
	By youremail=By.name("your-email");
	By yourcontact=By.xpath("//body/div[@id='mm-0']/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[4]/label[1]/span[1]/input[1]");
	By yourposition=By.name("your-position");
	By yourcv=By.xpath("//body/div[@id='mm-0']/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[8]/label[1]/span[1]/input[1]");
	By submitnow=By.xpath("//*[@id=\"wpcf7-f6250-p6251-o1\"]/form/div[2]/div[9]/input");
	public Careerpage(WebDriver driver)
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
		driver.findElement(yourcv).click();
		fileUpload("\C:\Users\HP\Do);
		driver.findElement(submitnow).click();
	}
	public void fileUpload(String p) throws AWTException {
		// TODO Auto-generated method stub
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
