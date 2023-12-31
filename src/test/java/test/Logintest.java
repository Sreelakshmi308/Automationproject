package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Careerpage;
import page.Careworld;
import page.Contactpage;
import page.Facebookpage;
import page.Gallerypage;
import page.Homepage;
import page.Visapage;

public class Logintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.somansleisuretours.com/");
	}
	@Test
	public void testlogin() throws Exception
	{
		Homepage ob1=new Homepage(driver);
		ob1.searchactivity("Dubai");
		Careworld ob2=new Careworld(driver);
		ob2.about();
		ob2.world();
		Visapage ob3=new Visapage(driver);
		ob3.visadetails();
		Careerpage ob4=new Careerpage(driver);
		ob4.tocareer("sreelakshmi","sree","abc","tester");
		Gallerypage ob5=new Gallerypage(driver);
		ob5.galleryview();
		Contactpage ob6=new Contactpage(driver);
		ob6.contactdetails("Sreelakshmi", "ssreelakshmi308@gmail.com", "Testing", "Hi");
		Facebookpage ob7=new Facebookpage(driver);
		ob7.fbpage();
	}
}
