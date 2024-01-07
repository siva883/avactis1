package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_DataEntry {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Opens the chrome browser
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement firstName=driver.findElement(By.id("firstName"));
		firstName.sendKeys("Siva");
		WebElement lastName=driver.findElement(By.id("lastName"));
		lastName.sendKeys("Bommisetty");
		System.out.println("First Name: " + firstName.getAttribute("value"));
		System.out.println("Last Name: " + lastName.getAttribute("value"));
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	
		

	}

}
