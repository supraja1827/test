package Supraja;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
//To access obj/elem methods
import org.openqa.selenium.By;


public class TC002
{
	
public static void main(String[] args)throws Exception
	{
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(5000);
	System.out.println("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(5000);
	//driver.findElement(By.name("Submit")).click();
	driver.findElement(By.name("clear")).click();
	System.out.println("Cleared");

	Thread.sleep(5000);
	driver.close();





	}

}
