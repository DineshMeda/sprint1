package login;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigationpanel {

	public static void main(String[] args) throws IOException {
		
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
			    
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/appointment/search']")).click();//front office
			    File take = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take, new File("./screenshot/frontoffice.png"));
				
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/patient/search']")).click();// opd
			    File take1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(take1, new File("./screenshot/opd.png"));
			    
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/patient/ipdsearch']")).click();//ipd
			    File take2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take2, new File("./screenshot/ipd.png"));
				
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/pharmacy/bill']")).click();//pharmacy
			    File take3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(take3, new File("./screenshot/pharmacy.png"));
			    
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/pathology/search']")).click();//pathology
			    File take4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take4, new File("./screenshot/pathology.png"));
				
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/radio/search']")).click();//radiology
			    File take5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take5, new File("./screenshot/radiology.png"));
				
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/operationtheatre/otsearch']")).click();//ot
			    File take6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			     FileUtils.copyFile(take6, new File("./screenshot/ot.png"));
			     
			    driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/bloodbankstatus/\"]")).click();//bloodbank
			    File take7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take7, new File("./screenshot/bloodbank.png"));
				
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/tpamanagement']")).click();//tpa
			    File take8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take8, new File("./screenshot/tpa.png"));
				
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fas fa-money-bill-wave\"]"))).click();//finance
			    File take9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take9, new File("./screenshot/finance.png"));
				
				WebElement element=driver.findElement(By.xpath("(//i[@class='fas fa-angle-right'])[1]"));//income
		        element.click();
		
				
				driver.findElement(By.xpath("(//i[@class=\"fas fa-angle-right\"])[2]")).click();//expenses
				
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/vehicle/search']")).click();//ambulance
			    File take10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take10, new File("./screenshot/ambulance.png"));
			    
			    driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/birthordeath']")).click();//birth and death
			    File take11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take11, new File("./screenshot/B&D.png"));
				driver.findElement(By.xpath("(//i[@class=\"fas fa-angle-right\"])[3]")).click();//birthrecord
				driver.findElement(By.xpath("(//i[@class=\"fas fa-angle-right\"])[4]")).click();//deathrecord
			    
			    
			    
			   WebElement Element = driver.findElement(By.xpath("//i[@class=\"fas fa-sitemap\"]")); //human resource
			   //scroll one method
			 /* JavascriptExecutor js =(JavascriptExecutor)driver;
			    js.executeScript("argument[0].scrollIntoView();", Element);
				   Element.click();*/
			   
			   Actions action =new  Actions(driver);
			   action.moveToElement(Element).click().build().perform();
			   File take12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take12, new File("./screenshot/HR.png"));
			    
			  
			    WebElement Element1 = driver.findElement(By.xpath("//i[@class=\"fas fa-bullhorn\"]"));//messaging
			    Actions action1 =new Actions(driver);
			    action1.moveToElement(Element1).click().build().perform();
			    File take13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(take13, new File("./screenshot/message.png"));
			    
			   WebElement Element2= driver.findElement(By.xpath("//i[@class=\"fas fa-luggage-cart\"]"));// inventory*/
			   Actions action2 = new Actions(driver);
			   action2.moveToElement(Element2).click().build().perform();
			   File take14 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take14, new File("./screenshot/inventory.png"));
			   
			   WebElement Element3 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/\"]")); //setup
			   Actions action3 = new Actions(driver);
			   action3.moveToElement(Element3).click().build().perform();
			   File take15 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take15, new File("./screenshot/inventory.png"));
			   
			   WebElement Element4 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/admin/search\"]"));//setup patient
			   Actions action4 = new Actions(driver);
			   action4.moveToElement(Element4).click().build().perform();
			   File take16 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take16, new File("./screenshot/Setup patient.png"));
			   
			   WebElement Element5= driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/charges\"]"));//setup hospital
			   Actions action5 = new Actions(driver);
			   action5.moveToElement(Element5).click().build().perform();
			   File take17 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take17, new File("./screenshot/setup hospital.png"));
			   
			   WebElement Element6 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/setup/bed/status\"]"));//setup bed
			   Actions action6 = new Actions(driver);
			   action6.moveToElement(Element6).click().build().perform();
			   File take18 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take18, new File("./screenshot/setup bed.png"));
			   
			   WebElement Element7 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/visitorspurpose\"]"));// setup frontoffice
			   Actions action7 = new Actions(driver);
			   action7.moveToElement(Element7).click().build().perform();
			   File take19 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take19, new File("./screenshot/setup frontoffice.png"));
			   
			   WebElement Element8 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/medicinecategory/index\"]"));// setup pharmacy
			   Actions action8 = new Actions(driver);
			   action8.moveToElement(Element8).click().build().perform();
			   File take20 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take20, new File("./screenshot/setup pharmacy.png"));
			   
			   WebElement Element9 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/pathologycategory/addcategory\"]"));//setup pathology
			   Actions action9 = new Actions(driver);
			   action9.moveToElement(Element9).click().build().perform();
			   File take21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take21, new File("./screenshot/setup pathology.png"));
			   
			   WebElement Element10 =driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/lab/addLab\"]"));//setup radiology
			   Actions action10 = new Actions(driver);
			   action10.moveToElement(Element10).click().build().perform();
			   File take22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take22, new File("./screenshot/setup radiology.png"));
			   
			   WebElement Element11 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/symptoms\"]"));//setup symptoms
			   Actions action11 =new Actions(driver);
			   action11.moveToElement(Element11).click().build().perform();
			   File take23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take23, new File("./screenshot/setup symptoms.png"));
			   
			   WebElement Element12 =driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/incomehead\"]"));//setup finance
			   Actions action12 = new Actions(driver);
			   action12.moveToElement(Element12).click().build().perform();
			   File take24 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take24, new File("./screenshot/setup finance.png"));
			   
			   WebElement Element13 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/birthordeathcustom\"]"));//setup birth and death
			   Actions action13 = new Actions(driver);
			   action13.moveToElement(Element13).click().build().perform();
			   File take25 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take25, new File("./screenshot/setup birth and death.png"));
			   
			   WebElement Element14 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/leavetypes\"]"));// setup human resource
			   Actions action14 = new Actions(driver);
			   action14.moveToElement(Element14).click().build().perform();
			   File take26 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take26, new File("./screenshot/setup human resource.png"));
			   
			   WebElement Element15 = driver.findElement(By.xpath("//a[@href=\"http://kareclouds.com/admin/itemcategory\"]"));//setup inventory
			   Actions action15 = new Actions(driver);
			   action15.moveToElement(Element15).click().build().perform();
			   File take27 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(take27, new File("./screenshot/setup inventory.png"));

	}

}
