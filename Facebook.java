package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Why id and classname is not working it shows "Exception NoSuchElementException"
		//driver.findElement(By.id("u_0_2_qX")).click();
		//driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		
		//driver.findElement(By.id("u_6_b_gI")).sendKeys("Test");
		driver.findElement(By.name("firstname")).sendKeys("test");
		//driver.findElement(By.id("u_6_d_WW")).sendKeys("leaf");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		//driver.findElement(By.id("u_2_g_jM")).sendKeys("testleaf@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("Testleaf@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Testleaf@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testleaf");
		WebElement day = driver.findElement(By.id("day"));
		Select drop=new Select(day);
		drop.selectByValue("1");
		WebElement month = driver.findElement(By.id("month"));
		Select drop1=new Select(month);
		drop1.selectByIndex(0);
		WebElement year=driver.findElement(By.id("year"));
		Select drop2=new Select(year);
		drop2.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@value=1]")).click();
		
		System.out.println("The program ends");
		
		
		
		
		

	}

}
