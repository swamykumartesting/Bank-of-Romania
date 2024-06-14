package Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class StudentPractise {
	
	public WebDriver driver;
		
  @Test(priority = 1)
  public void registerform() {
	  
//Enter MobileNO  
driver.findElement(By.id("userNumber")).sendKeys("9999988888");

//DOJ 4 operations
driver.findElement(By.id("dateOfBirthInput")).click();

//Month
new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("December");

//year
new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1990");

//Day
driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]")).click();

//subjects
driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Maths");
driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys(Keys.ENTER);


//State
driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys("Uttar Prades");
driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys(Keys.ENTER);

//uploadfile
driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Charvik\\Desktop\\download.jpeg");

  }
  
 
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  
	  
  }

  
  
  @AfterTest
  public void afterTest() {
	  
	  
  }

}
