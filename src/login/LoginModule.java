package login;




import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginModule {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Thread.sleep(5000);
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Karecloud\\Resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("http://kareclouds.com/site/login");//url
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");//username
		driver.findElement(By.id("password")).sendKeys("Admin@123");//password
	    driver.findElement(By.xpath("//button[@type='submit']")).click();//submit button
	    
	       driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();//login and logout button
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-sign-out fa-fw\"]"))).click();//logout

	    driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/site/forgotpassword\"]")).click();//forgot password
	    driver.findElement(By.xpath("//input[@class=\"form-username form-control\"]")).sendKeys("superadmin@gmail.com");
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"btn\"]"))).click();
	   
	  /* //screenshot individual element
	   File name = driver.findElement(By.xpath("//a[@class='dropdown-toggle todoicon']")).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(name, new File("./screenshot/notification.png"));
	    
	    
	    //explicit wait code 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='dropdown-toggle todoicon']"))).click();
	    
	    //screenshot for page
	   File take = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(take, new File("./screenshot/dashboard.png"));
	  
	    
	   WebElement Element = driver.findElement(By.xpath("//i[@class=\"fas fa-sitemap\"]")); //human resource
	   //scroll one method
	   /* JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("argument[0].scrollIntoView();", Element);
		   Element.click();*/
	   
	  
	   
	    
	    
	    
	    
	    
	    
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
