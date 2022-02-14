package SDETPkg;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_9_AvoidusingTestAnnotation {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balabhadrunia\\eclipse-workspace\\testing\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.broadridge.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0, -1000));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.close();
	}
}
