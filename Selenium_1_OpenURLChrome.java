package SDETPkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1_OpenURLChrome {

	public static void main(String[] args)  throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\balabhadrunia\\eclipse-workspace\\testing\\src\\main\\resources\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(5000);
				driver.manage().window().maximize();
		  		System.out.println("opened website in chrome browser");
		 		driver.close();
			}
}
