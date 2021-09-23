package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, null);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//ul[@class='wp-categories-list'])/li[4]/a[1]")).click();
		
	
	driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]/img")).click();
	String title1 = driver.getTitle();
	System.out.println(title1);
//Image is broken/not
	
	String attribute = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/img")).getAttribute("src");
	driver.get(attribute);
	if(driver.getTitle().contains("Not Found"))
	{
		System.out.println("Broken");
	}
	else
	{
		System.out.println("Not broken");
	}
	
		//driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]")).click();
		//driver.findElement(By.xpath("(//ul[@class='wp-categories-list'])/li[4]/a[1]")).click();
		//WebElement key = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]"));
		//key.sendKeys(Keys.ENTER);
	}

}
