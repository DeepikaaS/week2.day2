package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");

//driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
Point location = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
System.out.println("The X and y Location are "+location);
String attribute = driver.findElement(By.xpath("//button[text()='What color am I?']")).getAttribute("style");
System.out.println("The Background color is:"+attribute);
//Find the height and width
  Dimension size =driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize() ;
 System.out.println("The Size of field (Heigth and Width)is :"+size);
 
driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
String title = driver.getTitle();

System.out.println(title);
	}

}
