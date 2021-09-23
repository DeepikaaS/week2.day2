package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Edit.html");
driver.manage().window().maximize();
//Enter mailid
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deepikaa.senthilnathan@gmail.com");
String text = driver.findElement(By.xpath("//input[@value='Append ']")).getText();
String newText=text.concat("successfully");
driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(newText);
//String defaultText = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
//String dT = defaultText.getText();
//System.out.println("The default Textis: "+defaultText);
//WebElement default1 = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
//String text2 = default1.getText();
//Not printing-Doubt
//System.out.println("The default text is" +default1.getText());
String attribute = driver.findElement(By.xpath("(//input[@type='text'])[3]")).getAttribute("value");
System.out.println("The default textbox attribute  is"+attribute);
driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

WebElement TypeCheck = driver.findElement(By.xpath("(//label[text()='Confirm that edit field is disabled'])/following-sibling::input"));
if((TypeCheck).isEnabled())
{
	System.out.println("This field is enabled");
	
}
else
	System.out.println("this field is disabled");
driver.close();
	}

}
