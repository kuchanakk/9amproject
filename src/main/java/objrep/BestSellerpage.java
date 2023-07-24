package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellerpage {
	
	static WebDriver driver;
	
	public BestSellerpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public WebElement bestsellersblock() {
		
		return driver.findElement(By.id("ajaxLoadData"));
		
	}
	

	public WebElement bestseller1() {
		
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[1]/div/div[2]/h2/a"));
		
	}
	
public WebElement bestseller2() {
		
		return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[2]/div/div[2]/h2/a"));
		
	}
	
public WebElement bestseller3() {
	
	return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[3]/div/div[2]/h2/a"));
	
}

public WebElement bestseller4() {
	
	return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[4]/div/div[2]/h2/a"));
	
}

public WebElement bestseller5() {
	
	return driver.findElement(By.xpath("//*[@id=\"ajaxLoadData\"]/div[5]/div/div[2]/h2/a"));
	
}


}
