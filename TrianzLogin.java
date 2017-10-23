package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrianzLogin {

	public static WebDriver wd = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Personel\\Softwares\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		wd = new FirefoxDriver();
		wd.get("https://trinet.trianz.com");
		// wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//input[@id='_58_login']")).sendKeys(
				"rajasekhar.kakumanu");
		wd.findElement(By.xpath("//input[@id='_58_password']")).sendKeys(
				"Trianz2017*");
		wd.findElement(By.xpath("//button[@class='btn  btn-primary']")).click();

	}

}
