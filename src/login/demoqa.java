package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//driver.findElement(By.xpath("//button[@id=\"login\"]")).click();
		//driver.navigate().back();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id=\\\"item-0\\\"])[1]"))).click();
		//driver.findElement(By.xpath("(//li[@id=\"item-0\"])[1]")).click();

	}

}
