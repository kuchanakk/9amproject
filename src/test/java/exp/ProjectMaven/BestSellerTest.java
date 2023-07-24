package exp.ProjectMaven;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import exceldata.BestsellersReadWrite;
import objrep.BestSellerpage;
import objrep.HomePage;

public class BestSellerTest extends TestBase{
	
	
	@BeforeMethod
	public static void openbrowser() {
		
		TestBase tb = new TestBase();
		tb.openbrowser("firefox");
		
	}
	
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
		
	}
	
	
	@Test
	public static void besttest() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.Bestseller().click();
		BestsellersReadWrite testdata=new BestsellersReadWrite();
		int rcountnuber=testdata.rcount();
		
		

		BestSellerpage bests= new BestSellerpage(driver);
		String best1=bests.bestseller1().getText();
		String best2=bests.bestseller2().getText();
		String best3=bests.bestseller3().getText();
		String best4=bests.bestseller4().getText();
		String best5=bests.bestseller5().getText();
		for(int i =1;i<=rcountnuber;i++) {
		
			String expctedtext=testdata.readdata(i, 0);
		

		if(best1.contains(expctedtext)) {
			
			testdata.writedata(i, 1, "valid data");
			
		}else if(best2.contains(expctedtext)) {
			
			testdata.writedata(i, 1, "valid data");
			
		}else if(best3.contains(expctedtext)) {
			
			testdata.writedata(i, 1, "valid data");
			
		}else if (best4.contains(expctedtext)) {
			
			testdata.writedata(i, 1, "valid data");
		} else if(best5.contains(expctedtext)) {
			
			testdata.writedata(i, 1, "valid data");

			
		}else {
			
			testdata.writedata(i, 1, "invalid data");

			
		}
		
		
		
		}
	}
	
	

}
