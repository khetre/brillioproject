package brillioproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class meven {
	@Test
	public void test1()
	{
		System.out.println("enggg");
	}
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ashwinkumar.khetre\\Desktop\\drivers\\geckodriver.exe");
		System.out.println("open browser");
		WebDriver driver=new FirefoxDriver();
	}
	@AfterMethod
	public void close()
	{
		System.out.println("close browser");
	}

}
