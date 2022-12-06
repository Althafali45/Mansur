package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdacticMaven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\project_work\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("username"));
		username.click();
		username.sendKeys("Mansurali");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Althaf");

		driver.findElement(By.id("login")).click();

		WebElement hotelLocation = driver.findElement(By.id("location"));
		hotelLocation.click();

		Select ll = new Select(hotelLocation);
		ll.selectByValue("New York");

		WebElement hotelName = driver.findElement(By.id("hotels"));
		hotelName.click();

		Select hh = new Select(hotelName);
		hh.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.name("room_type"));
		room.click();

		Select rr = new Select(room);
		rr.selectByValue("Deluxe");

		WebElement roomCount = driver.findElement(By.id("room_nos"));
		roomCount.click();

		Select rc = new Select(roomCount);
		rc.selectByValue("2");

		WebElement inDate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		inDate.click();
		inDate.clear();
		inDate.sendKeys("29/09/2022");

		WebElement outDate = driver.findElement(By.name("datepick_out"));
		outDate.click();
		outDate.clear();
		outDate.sendKeys("30/09/2022");

		WebElement adults = driver.findElement(By.name("adult_room"));
		adults.click();

		Select aa = new Select(adults);
		aa.selectByValue("2");

		WebElement children = driver.findElement(By.name("child_room"));
		children.click();

		Select cc = new Select(children);
		cc.selectByValue("3");

		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

		WebElement select = driver.findElement(By.name("radiobutton_0"));
		select.click();

		WebElement next = driver.findElement(By.id("continue"));
		next.click();

		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.click();
		firstName.sendKeys("Mansur");

		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.click();
		lastName.sendKeys("ali");

		WebElement address = driver.findElement(By.id("address"));
		lastName.click();
		address.sendKeys("no585 mangadu");

		WebElement cardNumber = driver.findElement(By.name("cc_num"));
		cardNumber.click();
		cardNumber.sendKeys("1234567891234567");

		WebElement cardType = driver.findElement(By.name("cc_type"));
		cardType.click();

		Select credit = new Select(cardType);
		credit.selectByVisibleText("VISA");

		WebElement month = driver.findElement(By.name("cc_exp_month"));
		month.click();

		Select mm = new Select(month);
		mm.selectByVisibleText("December");

		WebElement year = driver.findElement(By.name("cc_exp_year"));
		year.click();

		Select yy = new Select(year);
		yy.selectByValue("2022");

		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.click();
		cvv.sendKeys("123");

		WebElement book = driver.findElement(By.name("book_now"));
		book.click();

		Thread.sleep(8000);
		WebElement log = driver.findElement(By.id("logout"));
		log.click();
		
		

		
		
		
		
	}

}

