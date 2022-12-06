package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {
	public static WebDriver driver;

	private static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-CHN&gclid=Cj0KCQiAg_KbBhDLARIsANx7wAxr5wM_S5lLcQjy46jXYEE4tjQCkRPCEe_vUfPBDe8WOz5HOH1m1OIaAhjvEALw_wcB");
		driver.manage().window().maximize();
	
	}
	public static void rice() throws InterruptedException {
         WebElement rice = driver.findElement(By.id("input"));
         rice.sendKeys("rice");
         Thread.sleep(5000);
         }
	private static void dosaRice() {
          WebElement dosa = driver.findElement(By.xpath("//div[@class='form-inline'][1]"));
          dosa.click();
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		rice();
		dosaRice();
	}
}


