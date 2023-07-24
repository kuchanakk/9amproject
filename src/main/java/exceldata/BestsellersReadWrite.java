package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BestsellersReadWrite {
	static String path1=System.getProperty("user.dir");
	
	static String excelpathinfo =path1+"\\resource\\testdata\\ecomtestdatanew.xlsx";
	static FileInputStream fis ;
	static XSSFWorkbook wb;
	
	public  int rcount() throws IOException {
		 
		 fis = new FileInputStream(excelpathinfo);
		
		 wb = new XSSFWorkbook(fis);
		return wb.getSheet("Sheet1").getLastRowNum();
	}
	
	
	public String readdata(int row , int clm) {
		
		return wb.getSheet("Sheet1").getRow(row).getCell(clm).getStringCellValue();
		
	}
	
	
	public void writedata(int row , int clm , String value) throws IOException {
		
		
		wb.getSheet("Sheet1").getRow(row).createCell(clm).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelpathinfo);
		wb.write(fos);
		fos.close();
		
	}
	
	
	

}
