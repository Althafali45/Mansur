package webtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Corona {
	public static WebDriver driver;

	public static int indexofcountry;
	public static int indexofpopulation;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");

		driver.manage().window().maximize();

	}

	public static void getAllHeader() {
		Map<Integer, String> headerMap = new HashMap<Integer, String>();
		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr[@role='row']"));
		for (int i = 0; i < allheader.size(); i++) {
			String header = allheader.get(i).getText().replace("\n", " ");
			headerMap.put(i, header);
		}
		System.out.print(headerMap);
	}

	public static void getParticularDataIndia(String countryName) {
		List<WebElement> allRows = driver
				.findElements(By.xpath("//table[id='main_table_countries_today']/tbody[not(@class)]/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < allColumns.size(); j++) {
				if (allColumns.get(indexofcountry).getText().equals(countryName)) {
					allColumns.get(indexofpopulation).getText();
					System.out.println(countryName + "population is"+);
				}

			}
		}
	}

	public static void CoronaAllData() {

		List<WebElement> allData = driver
				.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td"));
		for (WebElement datas : allData) {
			System.out.println(datas.getText());
		}

	}

	public static void getParticularData() {
		WebElement particularData = driver
				.findElement(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr[7]/td[15]"));
		System.out.println(particularData.getText());

	}

	public static void allCountry() {
		List<WebElement> countries = driver
				.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td[2]"));
		for (WebElement country : countries) {
			System.out.println(country.getText());

		}
	}

	public static void header() {
		List<WebElement> he = driver.findElements(By.xpath("//table/thead/tr/th"));
		for (WebElement header : he) {
			System.out.print(header.getText());
		}
	}

	public static void main(String[] args) {
		browserLaunch();
//	   CoronaAllData();
//		getParticularData();
//		allCountry();
//		header();
		getAllHeader();

	}

}
