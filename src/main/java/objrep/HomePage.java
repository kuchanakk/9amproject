package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public  WebElement Bestseller() {
		
	return	driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div/div[2]/div/div/div/div/nav/ul/li[4]/a"));
		
		
	}
	
	public  WebElement todaysdeal() {
		
		return	driver.findElement(By.linkText("Today`s Deal"));
			
			
		}

}
