package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("UserFirstName-Vk4a ")).sendKeys("test");
		driver.findElement(By.name("UserFirstName")).sendKeys("Test");
		driver.findElement(By.name("UserLastName")).sendKeys("leaf");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testleaf@gmail.com");
				
		//Select jobTitle =new
		
		WebElement job=driver.findElement(By.xpath("//select[@name='UserTitle']"));
	Select drop1=new Select(job);
				drop1.selectByVisibleText("Customer Service Manager");
		
		//WebElement job=driver.findElement(By.xpath("//select[@id=\"UserTitle-ePgg\"]"));
		//Select drop1=new Select(job);
		//drop1.selectByValue("Customer Service Manager");
		  
		// d Select
		 //drop1=new Select(job); 
		 
		
		driver.findElement(By.name("CompanyName")).sendKeys("HTC");
		
		WebElement employees= driver.findElement(By.name("CompanyEmployees"));
		Select drop2=new Select(employees);
		drop2.selectByValue("250");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("78657654345");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		driver.quit();
		System.out.println("The program Ends");
		

	}

}
