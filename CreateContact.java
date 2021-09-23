package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.xpath("//a[@style='color: black;']")).click();
//driver.findElement(By.xpath("//div[@class='x-panel-header' and  @id='ext-gen633']")).click();
//driver.findElement(By.id("ext-gen841")).click();
driver.findElement(By.linkText("Contacts")).click();
//driver.findElement(By.id("ext-gen853")).click();
//Parent-Child
driver.findElement(By.xpath("//ul[@class='shortcuts']/li[2]")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Deeps");
//driver.findElement(By.name("firstName")).sendKeys("Deepikaa");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sai");
//driver.findElement(By.name("lastName")).sendKeys("Senthil");
driver.findElement(By.id("lastNameField")).sendKeys("Senthil");
driver.findElement(By.name("lastNameLocal")).sendKeys("Nathan");
driver.findElement(By.name("personalTitle")).sendKeys("DS");
driver.findElement(By.id("createContactForm_birthDate")).sendKeys("23/09/21");
//driver.findElement(By.id("ext-gen705")).sendKeys("Creating Title");
driver.findElement(By.xpath("//input[@class='inputBox' and @id='createContactForm_generalProfTitle']")).sendKeys("Titlename");
driver.findElement(By.xpath("//input[@class='inputBox' and @id='createContactForm_departmentName']")).sendKeys("Dep1");
WebElement preferredCurrency = driver.findElement(By.xpath("//select[@class='inputBox' and @id='createContactForm_preferredCurrencyUomId']"));
Select drop=new Select(preferredCurrency);
drop.selectByValue("AFA");
driver.findElement(By.xpath("//input[@class='inputBox' and @id='createContactForm_accountPartyId']")).sendKeys("434343434");
driver.findElement(By.xpath("//textarea[@class='inputBox' and @id='createContactForm_description']")).sendKeys("Description");

driver.findElement(By.xpath("//textarea[@class='inputBox' and @id='createContactForm_importantNote']")).sendKeys("Inportant notes are noted");
driver.findElement(By.xpath("//input[@class='inputBox' and @id='createContactForm_primaryPhoneCountryCode']")).clear();
driver.findElement(By.xpath("//input[@class='inputBox' and @id='createContactForm_primaryPhoneCountryCode']")).sendKeys("1");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.partialLinkText("Edit")).click();

driver.findElement(By.id("updateContactForm_description")).clear();
WebElement importantNotes = driver.findElement(By.id("updateContactForm_importantNote"));

importantNotes.clear();
importantNotes.sendKeys("Hi iam updating this field");

WebElement submit = driver.findElement(By.name("submitButton"));
submit.click();
String title = driver.getTitle();
System.out.println(title);

	}

}
