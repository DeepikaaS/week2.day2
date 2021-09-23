package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		
		  
		 
		  //get to know the url to be redirected
	    String urlToBeDirect = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
	    System.out.println("The Url to be redirected :"+urlToBeDirect);
	    
	    //url is broken or not
	    driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
	    if(driver.getTitle().contains("not found"))
	    	{
	    	System.out.println("This url is broken");
	    	}
	    else
	    {
	    	System.out.println("This url is not broken");
	    }
	    //#####################################
	  //The below code is not executing 
	    //#####################################
	    //got to home page
	    driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
	    String homePageTitle = driver.getTitle();
	    System.out.println(homePageTitle);
	    //Go to Home Page (Interact with same link name)
	    
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("(//a[@link='blue'])[1]")).click();
		  System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]"
		  )).click(); System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("(//a[@link='blue'])[3]")).click();
		  System.out.println(driver.getTitle());

	}

}
