package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard {

	public static void main(String[] args) throws InterruptedException {
		
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
	    
	    driver.findElement(By.xpath("//img[@src='http://kareclouds.com/uploads/hospital_content/logo/0.png']")).click();//logo
	    
	    driver.findElement(By.xpath("//span[@class='sidebar-session']"));//title of page
	    String title=driver.getTitle();
	    System.out.println("Title of the page =" +" "+ title);
	    
	    driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("1005");//search box
	    driver.findElement(By.id("search-btn")).click();//search button
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("//span[@class='flag-icon flag-icon-us']")).click();//language
	    
	    driver.findElement(By.id("beddata")).click();//bed data
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='ukclose']")).click();// bed data page close
	    
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/calendar/events\" title=\"Calendar\"><i class=\"fa fa fa-calendar\"></i></a>']")).click();
	    driver.findElement(By.xpath("//i[@class='fa fa fa-calendar']")).click();// calendar
        driver.navigate().back();
        
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle todoicon']")).click();//task
	   
	  /* //screenshot individual element
	   File name = driver.findElement(By.xpath("//a[@class='dropdown-toggle todoicon']")).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(name, new File("./screenshot/notification.png"));
	    
	    
	    //explicit wait code 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='dropdown-toggle todoicon']"))).click();
	    
	    //screenshot for page
	   File take = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(take, new File("./screenshot/dashboard.png"));*/
	    
	    driver.findElement(By.xpath("//span[@class='label label-warning']")).click();//notification
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();//login and logout button 
	    driver.findElement(By.xpath("//i[@class=\"fa fa-user\"]")).click();//profile button
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();//login and logout button
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"http://kareclouds.com/admin/admin/changepass\"]"))).click();//password
	   
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();//login and logout button
     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-sign-out fa-fw\"]"))).click();//logout

	}

}
