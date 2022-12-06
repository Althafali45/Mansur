package com.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationMaven {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\project_work\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);

	WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])"));

	Actions aa = new Actions(driver);
	aa.moveToElement(women).build().perform();

	WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
	casual.click();

	WebElement add = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
	add.click();

	WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	proceed.click();

	WebElement dressNo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	dressNo.clear();
	dressNo.sendKeys("6");

	WebElement checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	checkout.click();

//  WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	email.click();
//	email.sendKeys("aalthaf045@gmail.com");

//	WebElement register = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
//	register.click();

//	WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//	gender.click();

//	WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//	FirstName.click();
//	FirstName.sendKeys("Althaf");

//	WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//	LastName.click();
//	LastName.sendKeys("Ali");

//	WebElement Pass = driver.findElement(By.name("passwd"));
//	Pass.click();
//	Pass.sendKeys("ALTHAF");

//	WebElement date = driver.findElement(By.id("days"));
// 	Select dd = new Select(date);
//	dd.selectByValue("25");

//	WebElement month = driver.findElement(By.id("months"));
//	Select mm = new Select(month);
//	mm.selectByValue("2");

//	WebElement year = driver.findElement(By.id("years"));
//	Select yy = new Select(year);
//	yy.selectByValue("1999");

//	WebElement CompanyName = driver.findElement(By.id("company"));
//	CompanyName.click();
//	CompanyName.sendKeys("Greens");

//	WebElement address = driver.findElement(By.id("address1"));
//	address.click();
//	address.sendKeys("NO 585 mangadu");

//	WebElement address2 = driver.findElement(By.id("address2"));
//	address2.click();
//	address2.sendKeys("yyyyyy");

//	WebElement CityName = driver.findElement(By.id("city"));
//	CityName.click();
//	CityName.sendKeys("CHENNAI");

//	WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
//	Select ss = new Select(state);
//	ss.selectByValue("5");

//	WebElement post = driver.findElement(By.id("postcode"));
//	post.click();
//	post.sendKeys("00000");

//	WebElement addInfo = driver.findElement(By.id("other"));
//	addInfo.click();
//	addInfo.sendKeys("1234567890");

//	WebElement phNo = driver.findElement(By.name("phone"));
//	phNo.click();
//	phNo.sendKeys("9790908120");

//	WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
//	mobile.click();
//	mobile.sendKeys("9090909090");

//	WebElement futureRef = driver.findElement(By.id("alias"));
//	futureRef.click();
//	futureRef.sendKeys("xxxxxxxxxxxxx");

//	WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
//	Register.click();
	
	WebElement mail = driver.findElement(By.id("email"));
	mail.click();
	mail.sendKeys("aalthaf045@gmail.com");

	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
	password.click();
	password.sendKeys("ALTHAF");

	WebElement signIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	signIn.click();

    WebElement proceedTo = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	proceedTo.click();
	
	WebElement agree = driver.findElement(By.id("cgv"));
	agree.click();
	
	WebElement proceedToCheck = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	proceedToCheck.click();
	
	WebElement pay = driver.findElement(By.xpath("(//a[@title='Pay by bank wire'])"));
	pay.click();
	
	WebElement confirm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	confirm.click();
	
	
}
}
